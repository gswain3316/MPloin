package com.example.MPloin.DataModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seat_id;
	// Seat Number has to auto-incremented from back-end.
	@Column
    private Integer seat_number;
	@Column
	private String empl_name;
	@Column
	private String empl_email;
	@Column
	private Boolean loggedIn;
	@Column
	private String status;
	@Column
	private String machine_status;
	public Long getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(Long seat_id) {
		this.seat_id = seat_id;
	}
	public Integer getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(Integer seat_number) {
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
	public Boolean getLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
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
