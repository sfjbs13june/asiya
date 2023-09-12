package com.asiya.app.model;

import org.springframework.stereotype.Component;

@Component
public class Hospital {

    String hospitalName;
    String address;
    int id;


    public Hospital(){}

    public Hospital(String hospitalName, String address, int id) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }



}
