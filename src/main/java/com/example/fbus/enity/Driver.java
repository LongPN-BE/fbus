package com.example.fbus.enity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_driver")
public class Driver {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    private Date joinDate;
    @ManyToOne(targetEntity = School.class)
    @JoinColumn(name = "schoolId", referencedColumnName = "id")
    private School school;

    public Driver() {
    }

    public Driver(String id, String name, Date joinDate) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
