package com.example.MPloin.DataModel;

import java.util.Objects;

public class Seat {
    private int seat_number;
    private String empl_name;
    private String empl_email;
    private boolean loggedIn;
    private String status;
    private String machine_id;

    public Seat(int seat_number) {
        this.seat_number = seat_number;
    }

    public Seat(int seat_number, String empl_name, String empl_email, boolean loggedIn, String status, String machine_id) {
        this.seat_number = seat_number;
        this.empl_name = empl_name;
        this.empl_email = empl_email;
        this.loggedIn = loggedIn;
        this.status = status;
        this.machine_id = machine_id;
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

    public String getMachine_id() {
        return machine_id;
    }

    public void setMachine_id(String machine_id) {
        this.machine_id = machine_id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seat_number=" + seat_number +
                ", empl_name='" + empl_name + '\'' +
                ", empl_email='" + empl_email + '\'' +
                ", loggedIn=" + loggedIn +
                ", status='" + status + '\'' +
                ", machine_id='" + machine_id + '\'' +
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
                Objects.equals(machine_id, seat.machine_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seat_number, empl_name, empl_email, loggedIn, status, machine_id);
    }
}
