package com.example.SpringSchedule.controller;


import com.example.SpringSchedule.model.POJO;
import com.example.SpringSchedule.repository.ScheduleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/")
public class TestController {

   @Autowired
   private ScheduleData scheduleData;

    @PostMapping(value = "test")
    public ResponseEntity getData(@RequestBody Map<String, String> json){

        POJO pojo = new POJO();
        pojo.setFirstName(json.get("firstName"));
        pojo.setLastName(json.get("lastName"));
        pojo.setTimeStamp(new Date());
        scheduleData.saveData(pojo);

        return new ResponseEntity("Data being saved to db", HttpStatus.OK);
    }
}
