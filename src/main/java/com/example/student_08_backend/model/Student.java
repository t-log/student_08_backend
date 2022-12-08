package com.example.student_08_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int admno;
    private String mob;
    private String clgName;
    private String parentName;
    private String parentPhno;
    private String username;
    private String password;

    public Student() {
    }

    public Student(int id, String name, int admno, String mob, String clgName, String parentName, String parentPhno, String username, String password) {
        this.id = id;
        this.name = name;
        this.admno = admno;
        this.mob = mob;
        this.clgName = clgName;
        this.parentName = parentName;
        this.parentPhno = parentPhno;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmno() {
        return admno;
    }

    public void setAdmno(int admno) {
        this.admno = admno;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentPhno() {
        return parentPhno;
    }

    public void setParentPhno(String parentPhno) {
        this.parentPhno = parentPhno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
