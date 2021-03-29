package com.example.demo.student;

import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

public class StudentCreateForm {

    private String name;
    private String email;
    private LocalDate dob;

    @Transient
    private Integer age;

    public StudentCreateForm(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = this.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
