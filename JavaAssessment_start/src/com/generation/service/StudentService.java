package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService {

    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, Course> courses = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        Student newStudent = new Student (student);
        students.put(student, newStudent);

    }

    public Student findStudent( String studentId )
    {
        if(students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        return students;
        return false;
    }

    public void enrollToCourse( String studentId, Course courseId )
    {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        student.enrollToCourse(courseId);

    }
}
