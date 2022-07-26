package com.ugrckl.peoplwdbweb.biz.model;
import lombok.Data;
import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Data
public class Person {
    protected String firstName;
    protected String lastName;
    protected String mailAddress;
    protected String phoneNumber;
    protected LocalDate dob;

    public Person(String firstName, String lastName, String mailAddress, String phoneNumber, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getFormattedDate(){
        return DateTimeFormatter.ofPattern("MMMM dd, yyyy").format(dob);
    }
}
