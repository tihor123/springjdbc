package com.spring.jdbc.entities;

public class Student {
    private int id;
    private String name;
    private String City;

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

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
    public Student(){}

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        City = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
