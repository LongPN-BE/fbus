package com.example.fbus.enity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_area")
public class Area {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    @ManyToOne(targetEntity = City.class)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
private City city;

    public Area() {
    }

    public Area(String id, String name) {
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
}
