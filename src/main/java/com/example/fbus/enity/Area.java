package com.example.fbus.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Tbl_area)
public class Area {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    private String cityId;

    public Area() {
    }

    public Area(String id, String name, String cityId) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
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

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
