package com.example.SpringSchedule;

import com.example.SpringSchedule.model.POJO;
import com.example.SpringSchedule.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private CrudRepository crudRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        for (int i = 0; i < 10; i++) {
//            POJO pojo = new POJO();
//            pojo.setId(i);
//            pojo.setFirstName("jesper");
//            pojo.setLastName("andersson");
//            pojo.setTimeStamp(new Date());
//            crudRepository.save(pojo);
//        }
    }
}
