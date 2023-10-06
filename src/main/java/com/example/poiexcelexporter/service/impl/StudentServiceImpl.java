package com.example.poiexcelexporter.service.impl;

import com.example.poiexcelexporter.entity.Student;
import com.example.poiexcelexporter.repository.StudentRepos;
import com.example.poiexcelexporter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepos studentRepo;

    @Override
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
    @Override
    public List < Student > getTheListStudent() {
        return studentRepo.findAll();
    }
}
