package com.cloverframework.dao;

import com.cloverframework.domain.Student;

/**
 * Created by Angus_Zhu on 11/24/2015.
 */
public interface StudentMapper {

    int saveStudent(Student s);

    Student getStudent(int id);


}
