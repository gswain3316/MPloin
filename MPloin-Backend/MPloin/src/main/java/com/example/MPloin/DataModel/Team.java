package com.example.MPloin.DataModel;

import java.util.List;

import javax.annotation.Generated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.Data;

//@Embeddable
@Data
public class Team {

	@Id
	private Long team_code;
//	@OneToMany
//	Employee empl;
	@NotBlank(message = "Company name is mandatory")
	private String company;
	@NotBlank(message = "Team name is mandatory")
	private String team_name;
	@NotNull(message = "Team size is mandatory")
	private Integer size;
	
	private List<Seat> empl_seat;
//	@Column
//	private Long seat_id;
//	@OneToMany(mappedBy = "teams")
//	@Embedded	
	 
	private List<Seat> seats;
	 

	public Long getTeam_code() {
		return team_code;
	}

	public void setTeam_code(Long team_code) {
		this.team_code = team_code;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

//	public Long getSeat_id() {
//		return seat_id;
//	}
//	public void setSeat_id(Long seat_id) {
//		this.seat_id = seat_id;
//	}
	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

}