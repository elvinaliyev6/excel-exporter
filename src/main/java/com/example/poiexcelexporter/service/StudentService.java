package com.example.poiexcelexporter.service;


import com.example.poiexcelexporter.entity.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List< Student > getTheListStudent();
}
