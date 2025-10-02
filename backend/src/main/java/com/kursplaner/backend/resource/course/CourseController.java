package com.kursplaner.backend.resource.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    private String getAllCourses() {
        return "123";
    }
    @PostMapping
    private void addCourse() {

    }

    @DeleteMapping
    private void deleteCourse() {

    }

    @PatchMapping
    private void updateCourse() {

    }
}
