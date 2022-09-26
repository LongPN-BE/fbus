package com.example.fbus.enity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_location")
public class Location {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    @ManyToOne(targetEntity = Area.class)
    @JoinColumn(name = "areaId", referencedColumnName = "id")
    private Area area;

    public Location() {
    }

    public Location(String id, String name) {
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
