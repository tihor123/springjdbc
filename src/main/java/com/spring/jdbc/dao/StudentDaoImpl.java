package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query = "insert into student (id, name, city) values (?, ?, ?)";
        int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return r;
    }

    @Override
    public int change(Student student) {
        String query = "update student set name=?, city=? where id=?";
        int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return r;
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        int r = this.jdbcTemplate.update(query, studentId);
        return 0;
    }

    @Override
    public Student getStudent(int id) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        return this.jdbcTemplate.queryForObject(query, rowMapper, id);
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
