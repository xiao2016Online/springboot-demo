package com.xiaopy.springboot.demo.repository;

import com.xiaopy.springboot.demo.entity.Student;
import com.xiaopy.springboot.demo.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends BaseRepository<Student,String> {
}
