package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.Appointment;
import util.DBUtil;

public class AppointService {

	static public int totalNum =10;
	static public int turn = 0;

	// 开始摇号及turn次数++
	public void beginAppoint() {
		turn++;
	}

	// 是否手机号以及身份证号已经在数据库中存在
	public boolean doesHaveAppointed(Appointment appointment) {
		String phoneString = appointment.getPhoneNumber();
		String idString = appointment.getidNumber();
		String sqlString = "select * form appointment where idNumber=idString or phoneNumber=phoneString";
		try (Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sqlString);) {
			ResultSet rs = ps.executeQuery();
			if (rs == null) {
				return false;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}

	public Integer getChanceNum(Appointment appointment) {
		int rowNum = 0;
		String phoneString = appointment.getPhoneNumber();
		String idString = appointment.getidNumber();
		String sqlString = "select * form appointment where " + "(idNumber=idString or phoneNumber=phoneString) "
				+ "and status=true";
		try (Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sqlString);) {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				rowNum++;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rowNum;

	}

	// 是否已经获取三次中签
	public boolean lessThanThreeChance(Appointment appointment) {
		if (getChanceNum(appointment) < 3) {
			return false;
		} else
			return true;
	}

	// 是否能参与此次预约,如果
	public boolean doesJoinThisAppoint(Appointment appointment) {
		if(appointment.getQuantity()>totalNum) {
			return false;
		}
		else if (doesHaveAppointed(appointment) || lessThanThreeChance(appointment)) {
			return true;
		} else
			return false;
	}

	// 插入数据库
	public void insertIntoDataBase(Appointment appointment) {
		totalNum-=appointment.getQuantity();
		String idString = appointment.getID();
		String nameString = appointment.getName();
		String idNumString = appointment.getidNumber();
		String phoneString = appointment.getPhoneNumber();
		Integer turnNum = appointment.getTurn();
		Integer quantity = appointment.getQuantity();
		Boolean status = appointment.getStatus();
		String sqlString = "insert into appointment value"
				+ "(idString,nameString,idNumString,phoneString,turnNum,quantity,status)";
		try (Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sqlString);) {
			ResultSet rs = ps.executeQuery(sqlString);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}