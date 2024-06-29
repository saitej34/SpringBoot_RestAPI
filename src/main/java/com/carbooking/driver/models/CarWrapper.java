package com.carbooking.driver.models;

public class CarWrapper {
    private Integer unique_vno;
    private String license_plate;
    private Integer seat_count;
    private String car_convertible;
    private Integer car_rating;
    private String engine_type;
    private Integer mid;
    private String mFranchiseName;
    private String address;
    private String contactNo;

    public CarWrapper(Integer unique_vno, String license_plate, Integer seat_count, Integer car_rating, String car_convertible, String engine_type, Integer mid, String mFranchiseName, String address, String contactNo) {
        this.unique_vno = unique_vno;
        this.license_plate = license_plate;
        this.seat_count = seat_count;
        this.car_rating = car_rating;
        this.car_convertible = car_convertible;
        this.engine_type = engine_type;
        this.mid = mid;
        this.mFranchiseName = mFranchiseName;
        this.address = address;
        this.contactNo = contactNo;
    }

    public Integer getUnique_vno() {
        return unique_vno;
    }

    public void setUnique_vno(Integer unique_vno) {
        this.unique_vno = unique_vno;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public Integer getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(Integer seat_count) {
        this.seat_count = seat_count;
    }

    public String getCar_convertible() {
        return car_convertible;
    }

    public void setCar_convertible(String car_convertible) {
        this.car_convertible = car_convertible;
    }

    public Integer getCar_rating() {
        return car_rating;
    }

    public void setCar_rating(Integer car_rating) {
        this.car_rating = car_rating;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getmFranchiseName() {
        return mFranchiseName;
    }

    public void setmFranchiseName(String mFranchiseName) {
        this.mFranchiseName = mFranchiseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
