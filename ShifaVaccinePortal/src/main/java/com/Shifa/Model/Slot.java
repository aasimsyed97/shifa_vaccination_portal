package com.Shifa.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum Slot {
    SLOT1("08:00 AM - 09:00 AM"),
    SLOT2("09:00 AM - 10:00 AM"),
    SLOT3("10:00 AM - 11:00 AM"),
    SLOT4("11:00 AM - 1200 PM"),
    SLOT5("12:00 PM - 01:00 PM"),
    SLOT6("01:00 PM - 02:00 PM"),
    SLOT7("02:00 PM - 03:00 PM"),
    SLOT8("03:00 PM - 04:00 PM"),
    SLOT9("04:00 PM - 05:00 PM");

    private final String timeslot;

    Slot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getTimeslot() {
        return timeslot;
    }
}
