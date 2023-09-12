package com.asiya.app.controller.unittest;

import com.asiya.app.controller.PatientHospitalController;
import com.asiya.app.model.Patient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PatientHospitalCotrollerTest {

    @InjectMocks
    private PatientHospitalController patientHospitalController = new PatientHospitalController();

    @Test
    public void savePatientTest(){
        Patient patient = new Patient("XYZ", 123, "Nobal", "Dengue") ;
        Patient patient1 = patientHospitalController.createPatient(patient);
        assertEquals(patient.getPatientName(), patient1.getPatientName());
        assertEquals(patient.getHospitalName(), patient1.getHospitalName());
        assertEquals(patient.getId(), patient1.getId());
        assertEquals(patient.getDisease(), patient1.getDisease());
    }

    @Test
    public void getPatientDetailsTest(){
        Patient patient = new Patient("XYZ", 123, "Nobal", "Dengue") ;
        patientHospitalController.createPatient(patient);
        Patient patient1 =patientHospitalController.readPatient("XYZ");
        assertEquals("XYZ", patient1.getPatientName());
        assertEquals(123,patient1.getId());
        assertEquals("Nobal", patient1.getHospitalName());
        assertEquals("Dengue", patient1.getDisease());
    }

    @Test
    public void updatePatientDetailsTest(){
        Patient patient = new Patient("XYZ", 123, "Nobal", "Dengue") ;
        patientHospitalController.createPatient(patient);
        Patient patient1 = patientHospitalController.updatePatient("XYZ", "Sahyadri");
        assertEquals("XYZ", patient1.getPatientName());
        assertEquals(123, patient1.getId());
        assertEquals("Sahyadri", patient1.getHospitalName());
        assertEquals("Dengue", patient1.getDisease());
    }

    @Test
    public void deletePatientDetailsTest(){
        Patient patient = new Patient();
        patient.setPatientName("XYZ");
        patient.setId(123);
        patient.setHospitalName("Nobel");
        patient.setDisease("Dengue");
        patientHospitalController.createPatient(patient);
        patientHospitalController.deletePatient("XYZ");
        Patient patient1 =patientHospitalController.readPatient("XYZ");
        assertNull(patient1);

    }
}
