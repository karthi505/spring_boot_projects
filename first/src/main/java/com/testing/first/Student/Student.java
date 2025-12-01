package com.testing.first.Student;

import java.time.LocalDate;

public class Student {
    private String Name;
    private Long id;
    private Integer age;
    private LocalDate dov;
    private String email;

    public Student(String name, Integer age, Long id, LocalDate dov, String email) {
        Name = name;
        this.age = age;
        this.id = id;
        this.dov = dov;
        this.email = email;
    }

    public Student(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDov() {
        return dov;
    }

    public void setDov(LocalDate dov) {
        this.dov = dov;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", dov=" + dov +
                ", email='" + email + '\'' +
                '}';
    }


}

