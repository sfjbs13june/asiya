package com.asiya.com.repository;
import com.asiya.com.model.Appointment;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AppointmentRepository {
    private Map<String, Appointment> appointmentMap= new HashMap<String,Appointment>();

    public Appointment getAppointments(String doctorName){
        return appointmentMap.get(doctorName);
    }

    public void saveAppointment(String name,Appointment appointment){
        appointmentMap.put(name,appointment);
    }
}
