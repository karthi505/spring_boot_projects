package com.testing.first.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                "Karthik Krishna S",
                20,
                1L,
                LocalDate.of(2000, Month.APRIL, 6),
                "karthikkrihsnas@gmail.com")
        );
    }
}
