package com.zc.mockito.domain.service;

import com.zc.mockito.domain.model.Student;

import java.util.List;

/**
 * @Classname StudentService
 * @Description TODO
 * @Date 2019/7/5 14:19
 * @Author is zhangchi
 */
public interface StudentService {

    public Student getStudent(int id);

    public List<Student> getStudentList();

    public Student updateStudent(Student student);

    public void deleteStudent(int id);

    public Student insertStudent(Student student);

}
