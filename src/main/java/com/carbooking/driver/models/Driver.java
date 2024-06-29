package com.carbooking.driver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Driver {

    @Id
    private Integer driverId;
    private String dName;
    private String licenseNo;
    private Integer attachedToCar;

    public Driver(){

    }

    public Driver(String dName, Integer driverId, String licenseNo, Integer attachedToCar) {
        this.dName = dName;
        this.driverId = driverId;
        this.licenseNo = licenseNo;
        this.attachedToCar = attachedToCar;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", dName='" + dName + '\'' +
                ", licenseNo='" + licenseNo + '\'' +
                ", attachedToCar=" + attachedToCar +
                '}';
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Integer getAttachedToCar() {
        return attachedToCar;
    }

    public void setAttachedToCar(Integer attachedToCar) {
        this.attachedToCar = attachedToCar;
    }
}
