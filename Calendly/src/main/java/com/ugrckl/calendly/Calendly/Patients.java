package com.ugrckl.calendly.Calendly;

import java.util.Objects;
import java.util.UUID;

public class Patients extends Users{
    private static UUID appointmentID;
    private Integer patientID;


    public Patients(Integer patientID, String firstName, String lastName, String mailAddress, String phoneNumber) {
        super(appointmentID);
        this.patientID = patientID;

    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patients patients = (Patients) o;
        return patientID.equals(patients.patientID) && firstName.equals(patients.firstName) && lastName.equals(patients.lastName) && mailAddress.equals(patients.mailAddress) && phoneNumber.equals(patients.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientID, firstName, lastName, mailAddress, phoneNumber);
    }
}
