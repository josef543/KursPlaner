package com.kursplaner.backend.resource.event;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "event")
public class Event {
    @Id
    private String id;
    private LocalDate date;
}
