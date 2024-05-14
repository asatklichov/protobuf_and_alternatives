package com.baeldung.protobuf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.protobuf.BaeldungTraining.Course;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepo;

    //http://localhost:8080/courses/1
    @RequestMapping("/courses/{id}")    //Accept: application/x-protobuf
    Course customer(@PathVariable Integer id) {
        return courseRepo.getCourse(id);
    }
}
