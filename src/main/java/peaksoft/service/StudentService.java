package peaksoft.service;

import peaksoft.entity.Student;

import java.util.List;


public interface StudentService {
    List<Student> findAll();

    void save(Student student);

    void deleteStudent(Long id);
}
