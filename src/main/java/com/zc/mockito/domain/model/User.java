package com.zc.mockito.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/7/5 15:50
 * @Author is zhangchi
 */
@Entity
@Table(name = "user", schema = "school_db")
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_pwd")
    private String password;
}
