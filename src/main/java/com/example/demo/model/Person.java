package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Person {
    private Long id;
    private String name;
    private String email;
    private Long deptId;
    private Dept dept;
    
    public Person() {}

    public Person(Long id, String name, String email, Long deptId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.deptId = deptId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
    
    public Dept getDept() { return dept; }
    public void setDept(Dept dept) { this.dept = dept; }
}
