package com.marwansalem.maxirail.service;

import java.util.List;

import org.junit.Test;

import com.marwansalem.maxirail.common.testing.AssertUtils;
import com.marwansalem.maxirail.model.TrainTime;

public class TrainTimeServiceTest {

    // used
    @Test
    public void getTrainTimeShouldNotBeEmpty() {
        TrainTimeService trainTimeService = new TrainTimeService();
        List<TrainTime> trainTimes = trainTimeService.getTrainTimes();
        AssertUtils.assertNotNull(trainTimes);
        AssertUtils.assertFalse("TrainTimes list is empty", trainTimes.isEmpty());
    }
}
