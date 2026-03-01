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
import Business.StudentProf.StudentProfDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    
    CourseDirectory courseDirectory;
    
    EnrollmentDirectory enrollmentDirectory;
    
    StudentProfDirectory studentProfDirectory;
    
    


    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        courseDirectory = new CourseDirectory();
        enrollmentDirectory = new EnrollmentDirectory();
        studentProfDirectory = new StudentProfDirectory();


    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }
    
    public CourseDirectory getCourseDirectory(){
        return courseDirectory;
    }
    
    public EnrollmentDirectory getEnrollmentDirectory(){
        return enrollmentDirectory;
    }
    
    public StudentProfDirectory getStudentProfDirectory(){
        return studentProfDirectory;
    }

}
