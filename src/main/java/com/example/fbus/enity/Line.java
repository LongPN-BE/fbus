package com.example.fbus.enity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_line")
public class Line {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    @ManyToOne(targetEntity = Trip.class)
    @JoinColumn(name = "tripId", referencedColumnName = "id")
    private Trip trip;

    public Line() {
    }

    public Line(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
