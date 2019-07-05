package com.zc.mockito.domain.repository;

import com.zc.mockito.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname StudentRepository
 * @Description TODO
 * @Date 2019/7/5 14:17
 * @Author is zhangchi
 */

public interface StudentRepository extends JpaRepository<Student, Integer> {

    public void deleteById(int id);
}
