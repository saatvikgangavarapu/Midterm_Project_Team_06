/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Courses;

import java.util.ArrayList;

/**
 *
 * @author Saatvik Gangavarapu
 */
public class CourseDirectory {
    private ArrayList<Course> courses;
    
    public CourseDirectory(){
        courses = new ArrayList<>();
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    public Course addACourse(String courseId, String courseName, int credits, String facultyId){
        Course c = new Course(courseId, courseName, credits, facultyId);
        courses.add(c);
        return c;
        
    }
    
    public ArrayList<Course> getCoursesByFaculty(String facultyId){
        ArrayList<Course> result = new ArrayList<>();
        for (Course c : courses){
            if (c.getFacultyId() != null && c.getFacultyId().equals(facultyId)){
                result.add(c);
            }
        }
        return result;
    }
    
    
}
