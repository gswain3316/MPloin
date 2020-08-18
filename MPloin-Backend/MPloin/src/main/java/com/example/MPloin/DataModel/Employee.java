package com.example.MPloin.DataModel;

public class Employee {
	
	private String empl_name;
	private String empl_email;
	private String gender;
	private String company;
	private String team_name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empl_name=" + empl_name + ", empl_email=" + empl_email + ", gender=" + gender + ", company="
				+ company + ", team_name=" + team_name + "]";
	}
	public Employee(String empl_name, String empl_email, String gender, String company, String team_name) {
		super();
		this.empl_name = empl_name;
		this.empl_email = empl_email;
		this.gender = gender;
		this.company = company;
		this.team_name = team_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((empl_email == null) ? 0 : empl_email.hashCode());
		result = prime * result + ((empl_name == null) ? 0 : empl_name.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((team_name == null) ? 0 : team_name.hashCode());
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
		Employee other = (Employee) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (empl_email == null) {
			if (other.empl_email != null)
				return false;
		} else if (!empl_email.equals(other.empl_email))
			return false;
		if (empl_name == null) {
			if (other.empl_name != null)
				return false;
		} else if (!empl_name.equals(other.empl_name))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (team_name == null) {
			if (other.team_name != null)
				return false;
		} else if (!team_name.equals(other.team_name))
			return false;
		return true;
	}
	
	

}
