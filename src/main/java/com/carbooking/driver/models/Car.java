package com.carbooking.driver.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Car {

    @Id
    private Integer unique_vno;
    private String license_plate;
    private Integer seat_count;
    private String car_convertible;
    private Integer car_rating;
    private String engine_type;

    @ManyToOne(cascade = CascadeType.ALL)
    private Manfacturer manfacturerDetails;

    public Car(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "unique_vno=" + unique_vno +
                ", license_plate='" + license_plate + '\'' +
                ", seat_count=" + seat_count +
                ", car_convertible='" + car_convertible + '\'' +
                ", car_rating=" + car_rating +
                ", engine_type='" + engine_type + '\'' +
                ", manfacturerDetails=" + manfacturerDetails +
                '}';
    }

    public Car(Integer unique_vno, Manfacturer manfacturerDetails, String engine_type, Integer car_rating, String car_convertible, Integer seat_count, String license_plate) {
        this.unique_vno = unique_vno;
        this.manfacturerDetails = manfacturerDetails;
        this.engine_type = engine_type;
        this.car_rating = car_rating;
        this.car_convertible = car_convertible;
        this.seat_count = seat_count;
        this.license_plate = license_plate;
    }

    public Integer getUnique_vno() {
        return unique_vno;
    }

    public void setUnique_vno(Integer unique_vno) {
        this.unique_vno = unique_vno;
    }

    public Manfacturer getManfacturerDetails() {
        return manfacturerDetails;
    }

    public void setManfacturerDetails(Manfacturer manfacturerDetails) {
        this.manfacturerDetails = manfacturerDetails;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public Integer getCar_rating() {
        return car_rating;
    }

    public void setCar_rating(Integer car_rating) {
        this.car_rating = car_rating;
    }

    public String getCar_convertible() {
        return car_convertible;
    }

    public void setCar_convertible(String car_convertible) {
        this.car_convertible = car_convertible;
    }

    public Integer getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(Integer seat_count) {
        this.seat_count = seat_count;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }
}
