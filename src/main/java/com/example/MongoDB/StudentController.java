package com.example.MongoDB;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @RequestMapping(value = "fetchAllStudents",method = RequestMethod.GET)
    public List<StudentTest> fetchAllStudents(){
        List<StudentTest> StudentTests = studentService.getAllStudents();
        return StudentTests;
    }

    @RequestMapping(value = "saveStudent",method = RequestMethod.POST)
    public StudentTest saveStudent(@RequestBody StudentTest student) {
        return studentService.saveStudent(student);
    }

}
