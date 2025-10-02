package com.kursplaner.backend.resource.course;

import com.kursplaner.backend.resource.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository customerRepository;
}
