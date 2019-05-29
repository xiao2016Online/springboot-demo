package com.xiaopy.springboot.demo.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_student")
@Data
public class Student {

    @Id
    //这个是hibernate的注解/生成32位UUID
    @GenericGenerator(name="idGenerator", strategy="uuid")
    @GeneratedValue(generator="idGenerator")
    private String id;

    private int age;

    private String name;

    private String address;

    private String userCode;

}
