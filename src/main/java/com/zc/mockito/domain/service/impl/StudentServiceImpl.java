package com.zc.mockito.domain.service.impl;

import com.zc.mockito.domain.model.Student;
import com.zc.mockito.domain.repository.StudentRepository;
import com.zc.mockito.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname StudentServiceImpl
 * @Description TODO
 * @Date 2019/7/5 14:30
 * @Author is zhangchi
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(int id) {
        return studentRepository.getOne(id);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable).getContent();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }
}
