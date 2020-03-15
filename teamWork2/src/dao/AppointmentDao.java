package dao;

import pojo.Appointment;
import util.DBUtil;
import java.sql.*;

public class AppointmentDao {
	public void insert(Appointment a) {
		String sql = "insert into appointment values(null ,? ,? ,? ,? ,? ,?)";
		try (Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, a.getName());
            ps.setString(2, a.getidNumber());
            ps.setString(3, a.getPhoneNumber());
            ps.setString(4, String.valueOf(a.getTurn()));
            ps.setString(5, String.valueOf(a.getQuantity()));
            ps.setString(6, String.valueOf(a.getStatus()));
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                a.setID(String.valueOf(id));
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
	}
	
	public Appointment get(String sql) {
		try (Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ResultSet rs=ps.executeQuery(); //得到结果集
            //遍历
            while (rs.next()) {
            	String ID=rs.getString("ID");
                String name=rs.getString("name");
                String idNumber=rs.getString("idNumber");
                String phoneNumber=rs.getString("phoneNumber");
                int turn=Integer.parseInt(rs.getString("turn"));
                int quantity=Integer.parseInt(rs.getString("quantity"));
                Boolean status=Boolean.valueOf(rs.getString("status"));
                Appointment appointment=new Appointment();
                appointment.setID(ID);
                appointment.setName(name);
                appointment.setIdNumber(idNumber);
                appointment.setPhoneNumber(phoneNumber);
                appointment.setTurn(turn);
                appointment.setQuantity(quantity);
                appointment.setStatus(status);
                return appointment;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return null;
	}
}
