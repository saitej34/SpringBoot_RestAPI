package com.carbooking.driver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Manfacturer {

    @Id
    private Integer mid;
    private String mFranchiseName;
    private String address;
    private String contactNo;

    public Manfacturer(){

    }

    @Override
    public String toString() {
        return "Manfacturer{" +
                "mid=" + mid +
                ", mFranchiseName='" + mFranchiseName + '\'' +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }

    public Manfacturer(Integer mid, String mFranchiseName, String address, String contactNo) {
        this.mid = mid;
        this.mFranchiseName = mFranchiseName;
        this.address = address;
        this.contactNo = contactNo;
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
