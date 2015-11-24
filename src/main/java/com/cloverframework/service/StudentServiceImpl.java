package com.cloverframework.service;

import com.cloverframework.dao.StudentMapper;
import com.cloverframework.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Angus_Zhu on 11/24/2015.
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    @Transactional
    public Student getStudent(String id) {
      return  studentMapper.getStudent(Integer.valueOf(id));
    }
}
