package com.marwansalem.maxirail.model;

import java.time.LocalTime;

public class TrainTime {
    private final String departureStation;
    private final String destinationStation;
    private final LocalTime departureTime;
    private final LocalTime arrivalTime;

    public TrainTime(String departureStation, String destinationStation, LocalTime departureTime, LocalTime arrivalTime) {
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }
}
