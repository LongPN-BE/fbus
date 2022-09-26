package com.example.fbus.enity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tbl_busstop")
public class BusStop {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    private Date timeCome;
    @ManyToOne(targetEntity = Line.class)
    @JoinColumn(name = "lineId", referencedColumnName = "id")
    private Line line;
    @ManyToOne(targetEntity = Location.class)
    @JoinColumn(name = "locationId", referencedColumnName = "id")
    private Location location;

    public BusStop() {
    }

    public BusStop(String id, String name, Date timeCome) {
        this.id = id;
        this.name = name;
        this.timeCome = timeCome;
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

    public Date getTimeCome() {
        return timeCome;
    }

    public void setTimeCome(Date timeCome) {
        this.timeCome = timeCome;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
