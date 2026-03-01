/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Course;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    private ArrayList<Course> enrolledCourses;

//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;
    public StudentProfile(Person p) {
        super(p);
        enrolledCourses = new ArrayList<>();

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public boolean isMatch(String id) {
        return getPerson() != null && getPerson().getPersonId() != null && getPerson().getPersonId().equals(id);
    }

    // Add Course
    public void enrollCourse(Course c) {
        enrolledCourses.add(c);
    }

    // Remove Course
    public void dropCourse(Course c) {
        enrolledCourses.remove(c);
    }

    // Get Courses
    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}
