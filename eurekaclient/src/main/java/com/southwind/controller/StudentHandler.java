package com.southwind.controller;

import com.southwind.entiy.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;
    @Value("${server.port}")
    private String port;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return  studentRepository.findAll();
    }
    @GetMapping("/findByid/{id}")
    public Student findByid(@PathVariable("id")long id){
return studentRepository.findByid(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){

        studentRepository.SaveOrUpdate(student);
    }
    @PutMapping("/update")
    public  void update(@RequestBody Student  student){
        studentRepository.SaveOrUpdate(student);

    }
    @DeleteMapping("/deleteByid/{id}")
    public void deleteByid(@PathVariable long id){
        studentRepository.deleteByid(id);

    }
    @GetMapping("/index")
    public  String index(){
        return "当前端口"+this.port;
        }
}
