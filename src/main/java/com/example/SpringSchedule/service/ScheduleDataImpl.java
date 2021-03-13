package com.example.SpringSchedule.service;

import com.example.SpringSchedule.model.POJO;
import com.example.SpringSchedule.repository.ScheduleData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleDataImpl implements ScheduleData {

    private List<POJO> scheduleArray = new ArrayList<>();

    @Override
    public List<POJO> getData() {
        return scheduleArray;
    }

    @Override
    public void saveData(POJO pojo) {
        scheduleArray.add(pojo);
    }
}
