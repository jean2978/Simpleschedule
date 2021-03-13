package com.example.SpringSchedule.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(value = "test")
public class POJO {
//    @Id
//    private int id;
    private String firstName;
    private String lastName;
    private Date timeStamp;
}
