package com.asiya.com.repository;

import com.asiya.com.model.Prescription;

import java.util.HashMap;
import java.util.Map;

public class PrescriptionRepository {

    private Map<String, Prescription> appointmentMap= new HashMap<String,Prescription>();

    public Prescription getAppointments(String name){
        return appointmentMap.get(name);
    }

}
