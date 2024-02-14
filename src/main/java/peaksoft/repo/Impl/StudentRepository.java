package peaksoft.repo.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import peaksoft.entity.Student;
import peaksoft.repo.StudentRepo;

import java.util.List;


@Repository
@RequiredArgsConstructor
@Transactional
public class StudentRepository implements StudentRepo {

    @PersistenceContext
    private  EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        return entityManager
                .createQuery("select s from Student s", Student.class)
                .getResultList();
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void deleteStudent(Long id) {

        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);

    }
}
