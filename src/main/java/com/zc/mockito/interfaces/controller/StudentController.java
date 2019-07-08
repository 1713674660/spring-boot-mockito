package com.zc.mockito.interfaces.controller;

import com.zc.mockito.domain.model.Student;
import com.zc.mockito.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname StudentController
 * @Description TODO
 * @Date 2019/7/5 14:35
 * @Author is zhangchi
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/find/{id}")
    @ResponseBody
    public Student findStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }

    @GetMapping("/find")
    @ResponseBody
    public List<Student> findStudentList(){
        return studentService.getStudentList();
    }

    @PutMapping("/insert")
    @ResponseBody
    public Student insert(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @PutMapping("/update")
    @ResponseBody
    public Student update(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/findPage")
    @ResponseBody
    public List<Student> findAll(@PageableDefault(page = 1,size=4,sort={"id"},direction = Sort.Direction.DESC) Pageable pageable){
        return studentService.findAll(pageable);
    }

}
