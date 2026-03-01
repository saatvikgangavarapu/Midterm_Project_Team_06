/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enrollment;

import java.util.ArrayList;
import Business.Courses.Course;
import Business.Profiles.StudentProfile;

/**
 *
 * @author admin
 */
public class EnrollmentDirectory {
    private ArrayList<Enrollment> enrollments;

    public EnrollmentDirectory() {
        enrollments = new ArrayList<>();
    }

    public Enrollment addEnrollment(Course c, StudentProfile s, double grade) {
        Enrollment e = new Enrollment(c, s, grade);
        enrollments.add(e);
        return e;
    }

    public ArrayList<Enrollment> getEnrollmentByCourse(Course c) {
        ArrayList<Enrollment> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getCourse().equals(c)) {
                result.add(e);
            }
        }
        return result;
    }

    public ArrayList<Enrollment> getAllEnrollments() {
        return enrollments;
    }
    
}
