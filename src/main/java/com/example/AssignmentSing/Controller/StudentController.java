package com.example.AssignmentSing.Controller;

import com.example.AssignmentSing.Model.Student;
import com.example.AssignmentSing.Model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    private  StudentRepository studentRepository;
    @GetMapping("/getStudent")
    public @ResponseBody Iterable<Student> getStudent(@RequestParam(value = "idStudent", defaultValue = "0") int idStudent,
                                                         @RequestParam(value = "nameStudent", defaultValue = "") String nameStudent) {
        if (idStudent != 0) {
            System.out.println("id!");
            return studentRepository.findByidStudent(idStudent);
        }
        else if (!nameStudent.equals("")) {
            System.out.println("name!");
            return studentRepository.findBystudentName(nameStudent);
        }
        System.out.println("all!");
        return studentRepository.findAll();
    }
    @PostMapping("/addStudent")
    public  @ResponseBody String addStudent(@RequestBody Student student) {
        Iterable<Student> students = studentRepository.findByidStudent(student.getIdStudent());
        if (students.iterator().hasNext()) {
            return "Error: Student ID already exists";
        }
        studentRepository.save(student);
        return "Added";
    }
}
