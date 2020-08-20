<<<<<<< HEAD
package com.example.MPloin.DataModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Team{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long team_code;
	@Column
	private String company;
	@Column
	private String team_name;
	@Column
	private int size;
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
	public String getName() {
		return team_name;
	}
	public void setName(String team_name) {
		this.team_name = team_name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Team [team_code=" + team_code + ", company=" + company + ", name=" + team_name + ", size=" + size + ", seat="
				+ "]";
	}
	public Team(Long team_code, String company, String team_name, int size, Seat seat) {
		super();
		this.team_code = team_code;
		this.company = company;
		this.team_name = team_name;
		this.size = size;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((team_name == null) ? 0 : team_name.hashCode());
		result = prime * result + size;
		result = prime * result + ((team_code == null) ? 0 : team_code.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (team_name == null) {
			if (other.team_name!= null)
				return false;
		} else if (!team_name.equals(other.team_name))
			return false;
		
		if (size != other.size)
			return false;
		if (team_code == null) {
			if (other.team_code != null)
				return false;
		} else if (!team_code.equals(other.team_code))
			return false;
		return true;
	}
	
	
	
=======
package com.example.MPloin.DataModel;

public class Team{
	
	private String company;
	private String team_name;
	private int size;
	private Seat seat;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getteam_name() {
		return team_name;
	}
	public void setteam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Team(String company, String team_name, int size, Seat seat) {
		super();
		this.company = company;
		this.team_name = team_name;
		this.size = size;
		this.seat = seat;
	}
	public Team(String company) {
		super();
		this.company = company;
	}
	@Override
	public String toString() {
		return "Team [company=" + company + ", team_name=" + team_name + ", size=" + size + ", seat=" + seat + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((team_name == null) ? 0 : team_name.hashCode());
		result = prime * result + ((seat == null) ? 0 : seat.hashCode());
		result = prime * result + size;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (team_name == null) {
			if (other.team_name != null)
				return false;
		} else if (!team_name.equals(other.team_name))
			return false;
		if (seat == null) {
			if (other.seat != null)
				return false;
		} else if (!seat.equals(other.seat))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	public Team() {
		super();
  }
	
	
	
>>>>>>> 824d2c9f8451c45402b4c6bd3c96bb9b3fe5434d
}