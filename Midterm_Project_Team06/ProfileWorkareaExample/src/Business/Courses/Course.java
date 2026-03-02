/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Courses;

/**
 *
 * @author Saatvik Gangavarapu
 */
public class Course {

    private String courseId;
    private String courseName;
    private int credits;
    private String grade;
    private String facultyId;
    
    
    public Course(String courseId, String courseName, int credits, String facultyId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.facultyId = facultyId;
    }
 

    /**
     * Creates a Course object.
     *
     * @param courseId unique identifier for the course
     * @param courseName name of the course
     * @param credits number of credits assigned to the course
     * @param facultyId faculty assigned to teach the course
     */

   public Course(String courseId, String courseName, String grade, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.grade = grade;
        this.credits = credits;
        
    }
   
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;

    }

    public void setCredits() {
        this.credits = credits;
    }
    
    public void setCredits(int credits) {
    
        this.credits = credits;
    }

    public String getFacultyId() {
        return facultyId;
    }

    @Override
    public String toString() {
        return courseId;
    }

}
