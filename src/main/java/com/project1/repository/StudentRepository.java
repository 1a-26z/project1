package com.project1.repository;

import com.project1.pojo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findById(String id);

    List<Student> findAll();

    Student save(Student student);

    @Override
    void deleteById(Integer id);
}
