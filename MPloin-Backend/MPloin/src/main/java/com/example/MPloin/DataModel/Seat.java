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
	@Override
	public String toString() {
		return "Seat [seat_id=" + seat_id + ", seat_number=" + seat_number + ", empl_name=" + empl_name
				+ ", empl_email=" + empl_email + ", loggedIn=" + loggedIn + ", status=" + status + ", machine_status="
				+ machine_status + "]";
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(Long seat_id, int seat_number, String empl_name, String empl_email, boolean loggedIn, String status,
			String machine_status) {
		super();
		this.seat_id = seat_id;
		this.seat_number = seat_number;
		this.empl_name = empl_name;
		this.empl_email = empl_email;
		this.loggedIn = loggedIn;
		this.status = status;
		this.machine_status = machine_status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empl_email == null) ? 0 : empl_email.hashCode());
		result = prime * result + ((empl_name == null) ? 0 : empl_name.hashCode());
		result = prime * result + (loggedIn ? 1231 : 1237);
		result = prime * result + ((machine_status == null) ? 0 : machine_status.hashCode());
		result = prime * result + ((seat_id == null) ? 0 : seat_id.hashCode());
		result = prime * result + seat_number;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Seat other = (Seat) obj;
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
		if (loggedIn != other.loggedIn)
			return false;
		if (machine_status == null) {
			if (other.machine_status != null)
				return false;
		} else if (!machine_status.equals(other.machine_status))
			return false;
		if (seat_id == null) {
			if (other.seat_id != null)
				return false;
		} else if (!seat_id.equals(other.seat_id))
			return false;
		if (seat_number != other.seat_number)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

<<<<<<< HEAD
  
=======
	public Seat(int seat_number, String empl_name, String empl_email, boolean loggedIn, String status, String machine_status) {
        this.seat_number = seat_number;
        this.empl_name = empl_name;
        this.empl_email = empl_email;
        this.loggedIn = loggedIn;
        this.status = status;
        this.machine_status = machine_status;
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

    public String getmachine_status() {
        return machine_status;
    }

    public void setmachine_status(String machine_status) {
        this.machine_status = machine_status;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seat_number=" + seat_number +
                ", empl_name='" + empl_name + '\'' +
                ", empl_email='" + empl_email + '\'' +
                ", loggedIn=" + loggedIn +
                ", status='" + status + '\'' +
                ", machine_status='" + machine_status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return seat_number == seat.seat_number &&
                loggedIn == seat.loggedIn &&
                Objects.equals(empl_name, seat.empl_name) &&
                Objects.equals(empl_email, seat.empl_email) &&
                Objects.equals(status, seat.status) &&
                Objects.equals(machine_status, seat.machine_status);
    }

    public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public int hashCode() {
        return Objects.hash(seat_number, empl_name, empl_email, loggedIn, status, machine_status);
    }
>>>>>>> 824d2c9f8451c45402b4c6bd3c96bb9b3fe5434d
}
