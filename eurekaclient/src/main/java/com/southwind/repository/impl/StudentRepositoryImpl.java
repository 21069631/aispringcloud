package com.southwind.repository.impl;

import com.southwind.entiy.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",24));
        studentMap.put(3L,new Student(3L,"王五",26));
        studentMap.put(4L,new Student(4L,"码子",32));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findByid(long id) {
        return studentMap.get(id);
    }

    @Override
    public void SaveOrUpdate(Student st) {
studentMap.put(st.getId(),st);
    }

    @Override
    public void deleteByid(long id) {
        studentMap.remove(id);

    }
}
