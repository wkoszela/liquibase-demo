package pl.wkoszela.liquibase_demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Airport {

    @Id
    private String code;
    private String name;
    private double latitude;
    private double longitude;

    public Airport(String code, String name, double latitude, double longitude) {
        this.code = code;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Airport() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s, %f, %f}", code, name, latitude, longitude);
    }
}
