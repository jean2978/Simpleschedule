package com.example.SpringSchedule.repository;

import com.example.SpringSchedule.model.POJO;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends org.springframework.data.repository.CrudRepository<POJO, Integer> {
}
