package com.tpe.service;

import com.tpe.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student findStudentById(Long id) {
        return null;
    }

    @Override
    public void saveStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Long id) {

    }
}
