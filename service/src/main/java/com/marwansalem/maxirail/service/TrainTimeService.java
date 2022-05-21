package com.marwansalem.maxirail.service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marwansalem.maxirail.model.TrainTime;

@Service
public class TrainTimeService {
     public List<TrainTime> getTrainTimes() {
        return Arrays.asList(
            new TrainTime("Alexandria:Sidi Gaber", "Cairo:Ramsis", LocalTime.of(10, 30), LocalTime.of(12, 30)),
            new TrainTime("Alexandria:Sidi Gaber", "Cairo:Ramsis", LocalTime.of(15, 0), LocalTime.of(17,00)),
            new TrainTime("Cairo:Ramsis", "Alexandria:Sidi Gaber", LocalTime.of(1, 0), LocalTime.of(3, 0)),
            new TrainTime("Cairo:Ramsis", "Alexandria:Sidi Gaber", LocalTime.of(17, 0), LocalTime.of(19, 0))
        );
    }
}