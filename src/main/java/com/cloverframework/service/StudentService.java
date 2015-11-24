package com.cloverframework.service;

import com.cloverframework.domain.Student;
import org.springframework.stereotype.Service;

/**
 * Created by Angus_Zhu on 11/24/2015.
 */
@Service
public interface StudentService {


    public Student getStudent(String id);
}
