package com.leondipac.controller;


import com.leondipac.entity.StudentEntity;
import com.leondipac.exception.RecordNotFoundException;
import com.leondipac.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping

    public ResponseEntity<List<StudentEntity>> getAllStudents(){
        List<StudentEntity> list = service.getAllStudents();

        return new ResponseEntity<List<StudentEntity>>(list, new HttpHeaders(), HttpStatus.OK);

    }

    @GetMapping ("/{id}")

    public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") Long id) throws RecordNotFoundException {
        StudentEntity entity = service.getStudentById(id);

        return new ResponseEntity<StudentEntity>(entity, new HttpHeaders(), HttpStatus.OK);

    }

    @PostMapping

    public ResponseEntity<StudentEntity> createOrUpdateStudent(@Validated @RequestBody StudentEntity student)
            throws RecordNotFoundException {
        StudentEntity updated = service.createOrUpdateStudent(student);

        return new ResponseEntity<StudentEntity>(updated, new HttpHeaders(), HttpStatus.OK);

    }

    @DeleteMapping ("/{id}")
    // Here, we are calling the deleteStudentById() method of the StudentService class.
    public HttpStatus deleteStudentById(@PathVariable("id") Long id) throws RecordNotFoundException {
        service.deleteStudentById(id);
        return HttpStatus.FORBIDDEN;

    }

}
