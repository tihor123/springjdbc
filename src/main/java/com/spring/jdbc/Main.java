package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("My program started-----------------");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao template = context.getBean("studentDao", StudentDao.class);
//        Student s1 = new Student();
//        s1.setId(666);
//        s1.setName("John Wick");
//        s1.setCity("HollyWood");
//
//        int n = template.insert(s1);
//        System.out.println("Student added " + 1);

//        Student s1 = new Student();
//        s1.setId(456);
//        s1.setName("Uttam Prasad");
//        s1.setCity("Lucknow");
//
//        int n = template.change(s1);
//        System.out.println("Student added " + 1);

//        int n = template.delete(666);
//        System.out.println("Student deleted " + 1);

//        Student s = template.getStudent(457);
//        System.out.println(s);

        List<Student> students = template.getAllStudents();

        for(Student s : students){
            System.out.println(s);
        }
    }
}