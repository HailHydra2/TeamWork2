package service;

import dao.AppointmentDao;
import pojo.Appointment;

public class AppointService {
	static public int turn = 0;
	
	public void beginAppoint() {
		turn++;
	}
	
	public boolean doesCanAppoint(Appointment appointment) {
		return true;
	}
	
	public boolean doesJoinThisTurn(Appointment appointment) {
		String PhoneNumber = appointment.getPhoneNumber();
		String IdNumber = appointment.getidNumber();
		return true;
	}
	
	public boolean doesGetChanceBefore(Appointment appointment) {
		return true;
	}

	public void insertIntoDataBase(AppointmentDao appp){

	}
}