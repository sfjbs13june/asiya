package com.asiya.com.model;

import org.springframework.stereotype.Component;

@Component
public class Appointment {

    String appointmentId;
    String patientName;
    String doctorName;
    String date;
    String prescription;

    public Appointment() { }

    public Appointment(String appointmentId, String patientName, String doctorName, String date, String prescription) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.prescription = prescription;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDate() {
        return date;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }


}
