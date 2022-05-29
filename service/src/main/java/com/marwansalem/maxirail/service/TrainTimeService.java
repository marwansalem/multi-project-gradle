package com.marwansalem.maxirail.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marwansalem.maxirail.common.utils.StringUtils;
import com.marwansalem.maxirail.model.TrainTime;

@Service
public class TrainTimeService {
    private static final int FIRST_NUMBERS_LIMIT = 1000;
     public List<TrainTime> getTrainTimes() {
        return Arrays.asList(
            new TrainTime("1", "Alexandria:Sidi Gaber", "Cairo:Ramsis", LocalTime.of(10, 30), LocalTime.of(12, 30)),
            new TrainTime("2", "Alexandria:Sidi Gaber", "Cairo:Ramsis", LocalTime.of(15, 0), LocalTime.of(17,00)),
            new TrainTime("3", "Cairo:Ramsis", "Alexandria:Sidi Gaber", LocalTime.of(1, 0), LocalTime.of(3, 0)),
            new TrainTime("4", "Cairo:Ramsis", "Alexandria:Sidi Gaber", LocalTime.of(17, 0), LocalTime.of(19, 0))
        );
    }

    public String getFirstNNumbers(int n) {
         n = n > FIRST_NUMBERS_LIMIT ? FIRST_NUMBERS_LIMIT : n;
         List<String> numbersAsString = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            numbersAsString.add((i + 1) + "");
        }

        return StringUtils.buildFromList(numbersAsString);
     }
}