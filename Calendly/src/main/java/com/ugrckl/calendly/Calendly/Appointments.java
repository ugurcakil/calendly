package com.ugrckl.calendly.Calendly;

import java.time.LocalDateTime;
import java.util.UUID;

public class Appointments {
    final private UUID appointmentID;
    private Doctors doctorID;
    private Patients patientID;
    private LocalDateTime startTimeOfAppointment;
    private LocalDateTime endTimeOfAppointment;
    private String room;
    private String status;
    private String subject;
    private String note;


    public Appointments(UUID appointmentID) {
        this.appointmentID = appointmentID;
    }
}
