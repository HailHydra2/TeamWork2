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

	// ��ʼҡ�ż�turn����++
	public void beginAppoint() {
		turn++;
	}

	// �Ƿ��ܲ���ԤԼ������ֻ����Լ����֤���Ѿ������ݿ��д��ڣ��Ͳ��ܲ���ԤԼ
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

	// �Ƿ��ܲ���˴�ҡ��,���
	public boolean doesJoinThisTurn(Appointment appointment) {
		String phoneString = appointment.getPhoneNumber();
		String idString = appointment.getidNumber();
		String sqlString = "select * from appointment where phoneNumber";

		return true;
	}

	// �Ƿ��Ѿ���ȡ������ǩ
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

	// �������ݿ�
	public void insertIntoDataBase(Appointment appointment) {

	}
}