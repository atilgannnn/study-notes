package com.tpe.repository;

import com.tpe.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository // @Component 'ı da içeriyor, Sipring Framework e bu clasımın repo katmanı olduğunu söylemiş oluyorum
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Long id) {

    }
}
