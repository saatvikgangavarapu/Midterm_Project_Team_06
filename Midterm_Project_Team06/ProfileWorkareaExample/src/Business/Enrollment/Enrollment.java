/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enrollment;

import Business.Courses.Course;
import Business.Profiles.StudentProfile;

/**
 *
 * @author Saatvik Gangavarapu
 */
public class Enrollment {
    private Course course;
    private StudentProfile student;
    private double grade;
    
    public Enrollment(Course course, StudentProfile student, double grade){
        this.course = course;
        this.student = student;
        this.grade = grade;
    }
    
    public Course getCourse(){
        return course;
    }
    
    public StudentProfile getStudent(){
        return student;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public void setGrade(double grade){
        this.grade = grade;
    }
    
    
}
