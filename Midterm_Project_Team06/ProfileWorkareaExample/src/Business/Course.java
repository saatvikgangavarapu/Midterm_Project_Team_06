/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author Tanvi Modi
 */
public class Course {
    
    private String courseId;
    private String courseName;
    private int credits;
    private String grade;

    public Course(String id, String name, int credits) {
        this.courseId = id;
        this.courseName = name;
        this.credits = credits;
        this.grade = "N/A";
    }

    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }
    public String getGrade() { return grade; }

    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return courseName;
    }
}
