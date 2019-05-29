package com.xiaopy.springboot.demo.service.impl;

import com.xiaopy.springboot.demo.entity.Student;
import com.xiaopy.springboot.demo.repository.StudentRepository;
import com.xiaopy.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student getStudent(String id) {
        Student student=null;
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            student=optional.get();
        }
        return student;
    }
}
