package com.example.MPloin.DataModel;

import java.util.Objects;

public class Team {
    
    private long id;
    private String name;
    private int size;
    private Seat seat;

    public Team(long id) {
        this.id = id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Team(long id, String name, int size, Seat seat) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.seat = seat;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", seat=" + seat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return id == team.id &&
                size == team.size &&
                Objects.equals(name, team.name) &&
                Objects.equals(seat, team.seat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, size, seat);
    }
}
