package com.example.poiexcelexporter.repository;


import com.example.poiexcelexporter.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepos extends JpaRepository<Student, Long > {

}
