package com.example.fbus.enity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_school")

public class School {
    @Id
    @GeneratedValue
    private String id;

    private String name;

    @ManyToOne(targetEntity = City.class)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;

    @ManyToOne(targetEntity = Location.class)
    @JoinColumn(name = "locationId", referencedColumnName = "id")
    private Location location;

    public School() {
    }

    public School(String id, String name) {
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
