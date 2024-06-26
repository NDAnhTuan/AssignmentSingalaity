package com.example.AssignmentSing.Model;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Integer> {
    // custom query to search to blog post by title or content
//    @Query("SELECT * FROM student WHERE idStudent = :idStudent")
    Iterable<Student> findByidStudent(int idStudent);
    Iterable<Student> findBystudentName(String nameStudent);
    Iterable<Student> findAll();

}
