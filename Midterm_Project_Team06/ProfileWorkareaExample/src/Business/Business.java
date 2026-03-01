/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;

import Business.Courses.CourseDirectory;

import Business.Enrollment.EnrollmentDirectory;
import Business.Profiles.FacultyDirectory;
import Business.StudentProf.StudentProfDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

     String name;

    PersonDirectory persondirectory;
    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;

    CourseDirectory courseDirectory;
    EnrollmentDirectory enrollmentDirectory;
    StudentProfDirectory studentProfDirectory;
    


    public Business(String n) {
         name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        facultydirectory = new FacultyDirectory();

        courseDirectory = new CourseDirectory();
        enrollmentDirectory = new EnrollmentDirectory();
        studentProfDirectory = new StudentProfDirectory();
        
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultydirectory;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public EnrollmentDirectory getEnrollmentDirectory() {
        return enrollmentDirectory;
    }

    public StudentProfDirectory getStudentProfDirectory() {
        return studentProfDirectory;
    }

}
