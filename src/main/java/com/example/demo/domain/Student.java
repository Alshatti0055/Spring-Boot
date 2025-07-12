//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.domain;

import java.time.LocalDate;

public class Student extends Person {
    private Long id;
    private String name;
    private String email;
    private LocalDate localDate;
    private Integer age;

    public Student(Long id, String name, String email, LocalDate localDate, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.localDate = localDate;
        this.age = age;
    }

    public Student(String name, String email, LocalDate localDate, Integer age) {
        this.name = name;
        this.email = email;
        this.localDate = localDate;
        this.age = age;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLocalDate() {
        return this.localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String fullName() {
        return super.fullName();
    }

    public String toString() {
        return "school.Student{fullName=\"" + this.fullName() + "\"}";
    }
}
