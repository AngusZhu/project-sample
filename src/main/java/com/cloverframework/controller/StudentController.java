package com.cloverframework.controller;

import com.cloverframework.dao.StudentDao;
import com.cloverframework.domain.Student;
import com.cloverframework.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Angus_Zhu on 11/24/2015.
 */
@Controller("/user")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/{id}")
    public String testget(@PathVariable("id") String  id,Model model){
        Student stu = studentService.getStudent(id);
        System.out.println(stu);
        model.addAttribute("stu", stu);
        return "/index";
    }
}