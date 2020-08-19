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
		// TODO Auto-generated constructor stub
	}
	
	
	
}