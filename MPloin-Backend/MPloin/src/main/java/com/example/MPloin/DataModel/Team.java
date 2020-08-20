package com.example.MPloin.DataModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Team{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long team_code;
	@Column
	@NotBlank(message = "Company name is mandatory")
	private String company;
	@Column
	@NotBlank(message = "Team name is mandatory")
	private String team_name;
	@Column
	@NotNull(message = "Team size is mandatory")
	private Integer size;
	@Column
	private Long seat_id;
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
	public Long getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(Long seat_id) {
		this.seat_id = seat_id;
	}
	
	
	
}