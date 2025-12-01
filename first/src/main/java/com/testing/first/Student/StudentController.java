package com.testing.first.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")


public class StudentController {
   public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    };

    @GetMapping
    public List<Student> getMethod_Students(){
        return studentService.getStudents();
    }

}


