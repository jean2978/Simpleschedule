package com.example.SpringSchedule.repository;

import com.example.SpringSchedule.model.POJO;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ScheduleData {

    void saveData(POJO pojo);

    List<POJO> getData();
}
