/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CourseDirectory {
    
     private ArrayList<Course> courseList;

    public CourseDirectory() {
        courseList = new ArrayList<>();

        // ✅ SYSTEM INITIAL COURSES (Test Data)
        courseList.add(new Course("INFO5001", "Application and engineer Dev sec spring 2026", 4));
        courseList.add(new Course("INFO5002", "Software Testing & Development", 4));
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public Course findCourseById(String id) {
        for (Course c : courseList) {
            if (c.getCourseId().equals(id)) {
                return c;
            }
        }
        return null;
    }
}
