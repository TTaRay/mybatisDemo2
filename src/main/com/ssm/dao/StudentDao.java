package com.ssm.dao;

import com.ssm.annotations.Select;
import com.ssm.domain.Student;

import java.util.List;

public interface StudentDao {
    //注解开发配置2
    /*@Select("select * from Student")
    List<Student> findAll();*/

    List<Student> findAll();
    void insertStudent(Student student);
    Student getStudentById(int id);
    void delStudentById(int id);
    void updStudent(Student student);
}
