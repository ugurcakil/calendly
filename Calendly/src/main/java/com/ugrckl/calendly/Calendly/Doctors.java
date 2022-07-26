package com.ugrckl.calendly.Calendly;

import java.util.UUID;

public class Doctors extends Users implements Specializations {
    private static UUID appointmentID;
    private Integer doctorID;

    private Specializations[] specializations;

    public Doctors(Integer doctorID, String firstName, String lastName, String mailAddress, String phoneNumber, Specializations[] specializations) {
        super(appointmentID);
        this.doctorID = doctorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
        this.specializations = specializations;
    }

    public Doctors addNewDoc(){
        Doctors newDoc = new Doctors();
        newDoc.firstName = getFirstName();
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Specializations[] getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Specializations[] specializations) {
        this.specializations = specializations;
    }
}

