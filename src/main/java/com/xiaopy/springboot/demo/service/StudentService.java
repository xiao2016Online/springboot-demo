package com.xiaopy.springboot.demo.service;

import com.xiaopy.springboot.demo.entity.Student;

public interface StudentService {

    /**
     * 获取学生
     * @param id
     * @return Student
     */
    Student getStudent(String id);
}
