package com.example.MPloin.DataModel;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seat_id;
	// Seat Number has to auto-incremented from back-end.
    private int seat_number;
    private String empl_name;
    private String empl_email;
    private boolean loggedIn;
    private String status;
    private String machine_status;
	public Long getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(Long seat_id) {
		this.seat_id = seat_id;
	}
	public int getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}
	public String getEmpl_name() {
		return empl_name;
	}
	public void setEmpl_name(String empl_name) {
		this.empl_name = empl_name;
	}
	public String getEmpl_email() {
		return empl_email;
	}
	public void setEmpl_email(String empl_email) {
		this.empl_email = empl_email;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMachine_status() {
		return machine_status;
	}
	public void setMachine_status(String machine_status) {
		this.machine_status = machine_status;
	}
    
    
}
