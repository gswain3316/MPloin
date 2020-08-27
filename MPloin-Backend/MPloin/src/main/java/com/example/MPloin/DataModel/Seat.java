package com.example.MPloin.DataModel;

import org.springframework.data.annotation.Id;

import lombok.Data;


//@Entity
@Data
public class Seat {
	
	@Id
	private Long seat_id;
	// Seat Number has to auto-incremented from back-end.
	/*
	 * @OneToOne Team teams;
	 */
	
    private Integer seat_number;
	
    private Employee empl;
	
	private Boolean loggedIn;
	
	private String status;
	
	public Employee getEmpl() {
		return empl;
	}
	public void setEmpl(Employee empl) {
		this.empl = empl;
	}
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
