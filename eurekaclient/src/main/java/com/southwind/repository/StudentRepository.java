package com.southwind.repository;

import com.southwind.entiy.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findByid(long id);
    public void SaveOrUpdate(Student st);
    public  void deleteByid(long id);
}
