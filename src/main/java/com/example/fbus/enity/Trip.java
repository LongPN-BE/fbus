package com.example.fbus.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tbl_trip")
public class Trip {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    private Date timeBegin;
    private Date timeEnd;

    public Trip() {
    }

    public Trip(String id, String name, Date timeBegin, Date timeEnd) {
        this.id = id;
        this.name = name;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
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

    public Date getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Date timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }
}
