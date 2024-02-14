package peaksoft.repo;

import peaksoft.entity.Student;

import java.util.List;


public interface StudentRepo {
    List<Student> findAll();

    void save(Student student);

    void deleteStudent(Long id);

}
