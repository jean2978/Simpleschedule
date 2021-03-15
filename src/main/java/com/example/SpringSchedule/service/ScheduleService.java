package com.example.SpringSchedule.service;

import com.example.SpringSchedule.model.POJO;
import com.example.SpringSchedule.repository.CrudRepository;
import com.example.SpringSchedule.repository.ScheduleData;
import com.mongodb.MongoSocketOpenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleService.class);

    @Autowired
    private ScheduleData scheduleData;

    @Autowired
    private CrudRepository crudRepository;

    @Scheduled(fixedDelay = 30000)
    public void ScheduleData(){

        if(scheduleData.getData() != null && !scheduleData.getData().isEmpty()){
            LOGGER.info("Amount of objects that will be added - " + scheduleData.getData().size());
            for (POJO pojo : scheduleData.getData()) {
                if(pojo != null){
                    try {
                        crudRepository.save(pojo);
                    }catch (MongoSocketOpenException e){
                        LOGGER.error(e.getMessage());
                    }
                }
            }
            scheduleData.getData().clear();
        }else{
            LOGGER.info("Data has not been added yet");
        }
    }

}
