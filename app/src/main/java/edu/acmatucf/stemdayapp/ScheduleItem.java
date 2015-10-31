package edu.acmatucf.stemdayapp;

import java.io.Serializable;

public class ScheduleItem implements Serializable {

    private final long startDate;
    private final long endDate;
    private final String title;
    private final String location;
    //private final double lat;
    //private final double lng;

    public ScheduleItem(long startDate, long endDate, String title, String location) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.location = location;
    }

    public long getStartDate() {
        return startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

//    public double getLat() {
//        return lat;
//    }
//
//    public double getLng() {
//        return lng;
//    }
}
