package com.kursplaner.backend.resource.course;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "course")
public class Course {
    @Id
    private String id;

    public Course(String id, LocalTime startTime, LocalTime endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    private LocalTime startTime;
    private LocalTime endTime;

}
