package com.ugrckl.calendly.Calendly;

import java.util.UUID;

public class Users extends Appointments {
    private String firstName;
    private String lastName;
    private String mailAddress;
    private String phoneNumber;

    public Users(UUID appointmentID) {
        super(appointmentID);
    }
}
