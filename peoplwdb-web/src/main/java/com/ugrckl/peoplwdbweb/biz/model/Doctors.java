package com.ugrckl.peoplwdbweb.biz.model;


import java.time.LocalDate;
import java.util.UUID;


public class Doctors extends Person {

    private final UUID appointmentID;
    private Integer doctorID;

    public Doctors(String firstName, String lastName, String mailAddress, String phoneNumber, LocalDate dob, UUID appointmentID, Integer doctorID) {
        super(firstName, lastName, mailAddress, phoneNumber ,dob);
        this.appointmentID = appointmentID;
        this.doctorID = doctorID;
    }
}
