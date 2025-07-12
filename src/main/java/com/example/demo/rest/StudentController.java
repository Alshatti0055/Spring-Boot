package com.example.demo.rest;

import com.example.demo.domain.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class StudentController {

    @GetMapping(path = "/students")
    public ResponseEntity<Student> index(@RequestParam(required = false) String name) {
        if (StringUtils.isBlank(name)) {
            return ResponseEntity.badRequest().build();
        }

        var student = new Student("abdul", "email.com", LocalDate.now(), 32);

        return ResponseEntity.ok(student);
    }

}
