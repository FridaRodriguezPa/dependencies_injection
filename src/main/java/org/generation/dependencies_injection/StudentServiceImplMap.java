package org.generation.dependencies_injection;

import org.generation.dependencies_injection.model.Student;
import org.generation.dependencies_injection.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImplMap implements StudentService {

HashMap<String,String> estudiantes = new HashMap<String,String>();

    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public List<Student> all() {
        return null;
    }

    @Override
    public Student findById(String id) {
        return null;
    }
}
