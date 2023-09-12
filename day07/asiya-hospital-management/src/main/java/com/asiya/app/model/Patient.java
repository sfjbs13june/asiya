package com.asiya.app.model;

import org.springframework.stereotype.Component;

@Component
public class Patient {
    String patientName;
    int id;
    String hospitalName;
    String disease;

    public Patient(){}

    public Patient(String patientName, int id, String hospitalName, String disease) {
        this.patientName = patientName;
        this.id = id;
        this.hospitalName = hospitalName;
        this.disease = disease;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getId() {
        return id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getDisease() {
        return disease;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }





}
