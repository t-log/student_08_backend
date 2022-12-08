package com.example.student_08_backend.dao;

import com.example.student_08_backend.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends CrudRepository<Student,Integer> {
    @Query(value = "SELECT `id`, `admno`, `clg_name`, `mob`, `name`, `parent_name`, `parent_phno`, `password`, `username` FROM `students` WHERE `name`=:name",nativeQuery = true)
    List<Student> searchStudent(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `students` WHERE `id`=:id",nativeQuery = true)
    void deleteStudent(@Param("id") Integer id);
}
