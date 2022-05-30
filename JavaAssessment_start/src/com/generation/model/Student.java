package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    private HashMap<Course> coursesEnrolledIn;

    float PASS_MIN_GRADE = 3.0f;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );

    }

    public void enrollToCourse( Course course )
    {
        coursesEnrolledIn.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return null;
    }

    public Course findCourseById( String courseId )
    {
        if (coursesEnrolledIn.containsKey(courseId)) {
            return coursesEnrolledIn.get(courseId);
        }
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return null;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
