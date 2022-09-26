package com.example.fbus.enity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_schedule")
public class Schedule {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    @ManyToOne(targetEntity = Bus.class)
    @JoinColumn(name = "busId", referencedColumnName = "id")
    private Bus bus;
    @ManyToOne(targetEntity = Driver.class)
    @JoinColumn(name = "driverId", referencedColumnName = "id")
    private Driver driver;
    @ManyToOne(targetEntity = Trip.class)
    @JoinColumn(name = "tripId", referencedColumnName = "id")
    private Trip trip;

    public Schedule() {
    }

    public Schedule(String id, String name) {
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

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
