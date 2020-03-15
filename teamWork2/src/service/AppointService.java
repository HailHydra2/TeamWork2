package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.org.apache.regexp.internal.recompile;

import dao.AppointmentDao;
import pojo.Appointment;

public class AppointService {
	static public int turn = 0;

	// 开始摇号及turn次数++
	public void beginAppoint() {
		turn++;
	}

	// 是否能参与预约，如果手机号以及身份证号已经在数据库中存在，就不能参与预约
	public boolean doesCanAppoint(Appointment appointment) {
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

	// 是否能参与此次摇号,如果
	public boolean doesJoinThisTurn(Appointment appointment) {
		String phoneString = appointment.getPhoneNumber();
		String idString = appointment.getidNumber();
		String sqlString = "select * from appointment where phoneNumber";

		return true;
	}

	// 是否已经获取三次中签
	public boolean doesGetChanceBefore(Appointment appointment) {
		String phoneString = appointment.getPhoneNumber();
		String idString = appointment.getidNumber();
		String sqlString = "select * form appointment where idNumber=idString or phoneNumber=phoneString";
		try (Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sqlString);) {
			ResultSet rs = ps.executeQuery();{
				while(re)
			}
			}
		return true;
	}

	// 插入数据库
	public void insertIntoDataBase(Appointment appointment) {

	}
}