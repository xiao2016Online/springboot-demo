package com.xiaopy.springboot.demo.controller;

import com.xiaopy.springboot.demo.entity.Student;
import com.xiaopy.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable String id){
        return studentService.getStudent(id);
    }

}
