package com.springproj.springproj.service;

import com.springproj.springproj.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllSTudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
