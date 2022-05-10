package com.devmind.curs19hibernatejparepo.controller;

import com.devmind.curs19hibernatejparepo.Student;
import com.devmind.curs19hibernatejparepo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/demo")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository stundetRepository) {
        this.studentRepository = stundetRepository;
    }

    @GetMapping(path = "/student/all")
    public @ResponseBody Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping(path = "/student")
    public @ResponseBody Optional<Student> getStudentByNumeAndPrenume(@RequestParam(name = "nume") String nume,
                                                 @RequestParam(name = "prenume", required = false)
                                                         String prenume) {
        if (prenume == null) {
            return  studentRepository.findByNume(nume);
        }
        return studentRepository.findByNumeAndPrenume(nume, prenume);
    }

    //get for: http://localhost:8080/demo/student/localitate?nume=mirel&localitate=Focsani
    @GetMapping(path = "/student/localitate")
    public @ResponseBody
    List<Optional<Student>> getStudentByNumeAndLocalitate(@RequestParam(name = "nume") String nume,
                                                          @RequestParam(name = "localitate") String localitate) {
        return studentRepository.findByNumeAndLocalitate(nume, localitate);
    }
}
