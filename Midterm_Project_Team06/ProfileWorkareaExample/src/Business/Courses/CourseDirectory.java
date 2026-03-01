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
        
        courses.add(new Course("INFO5001", "Application and engineer Dev sec spring 2026","", 4));
        courses.add(new Course("INFO5002", "Software Testing & Development","", 4));
        
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
        
        
    }
    
    public Course addACourse(String courseId, String courseName, int credits, String facultyId){
        Course c = new Course(courseId, courseName, credits, facultyId);
        courses.add(c);
        return c;
        
    }
    
    public Course findCourseById(String id) {
        for (Course c : courses) {
            if (c.getCourseId().equals(id)) {
                return c;
            }
        }
        return null;
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
