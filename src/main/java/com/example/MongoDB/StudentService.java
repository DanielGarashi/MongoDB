package com.example.MongoDB;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public List<StudentTest> getAllStudents(){
        //return studentRepository.findAll();
        return null;
    }


    public StudentTest saveStudent(StudentTest student) {
        return studentRepository.save(student);
    }
}
