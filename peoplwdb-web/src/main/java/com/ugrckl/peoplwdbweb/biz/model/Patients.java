package com.ugrckl.peoplwdbweb.biz.model;

import java.time.LocalDate;
import java.util.UUID;

public class Patients extends Person {
    private final UUID appointmentID;
    private Integer patientID;

    public Patients(String firstName, String lastName, String mailAddress, String phoneNumber, LocalDate dob, UUID appointmentID, Integer patientID) {
        super(firstName, lastName, mailAddress, phoneNumber, dob);
        this.appointmentID = appointmentID;
        this.patientID = patientID;
    }
}
