package com.marwansalem.maxirail.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marwansalem.maxirail.model.TrainTime;
import com.marwansalem.maxirail.service.TrainTimeService;

@RestController
public class MaxiRailController {
    private final TrainTimeService trainTimeService;

    public MaxiRailController(TrainTimeService trainTimeService) {
        this.trainTimeService = trainTimeService;
    }

    @GetMapping(path = "/")
    public List<TrainTime> getTimes() {
        return trainTimeService.getTrainTimes();
    }

    @GetMapping(path = "/")
    public TrainTime getFirstTrainTime() {
        return trainTimeService.getTrainTimes().get(0);
    }

}
