package com.zc.mockito.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2019/7/5 15:03
 * @Author is zhangchi
 */
@Data
@Entity
@Table(name = "student", schema = "school_db")

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private int id;

    @Column(name = "stu_name")
    private String name;

    @Column(name = "stu_sex")
    private String sex;

    @Column(name = "stu_age")
    private int age;

    @Column(name = "stu_phone")
    private String phone;

    @Column(name = "stu_email")
    private String email;

    @Column(name = "stu_addr")
    private String addr;
}
