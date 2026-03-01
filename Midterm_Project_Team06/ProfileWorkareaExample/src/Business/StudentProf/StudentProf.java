/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.StudentProf;

/**
 *
 * @author Saatvik Gangavarapu
 */
public class StudentProf {
    private String studentId;
    private String hobbies;
    private String interests;
    private String academicProgress;
    
    public StudentProf(String studentId){
        this.studentId = studentId;
        this.hobbies = "";
        this.interests = "";
        this.academicProgress = "";
    }
    
    public String getStudentId(){
        return studentId;
    }
    
    public String getHobbies(){
        return hobbies;
    }
    
    public void setHobbies(String hobbies){
        this.hobbies = hobbies == null ? "" : hobbies.trim();
    }
    
    public String getInterests(){
        return interests;
    }
    
    public void setInterests(String interests){
        this.interests = interests == null ? "" : interests.trim();
    }
    
    public String getAcademicProgress(){
        return academicProgress;
    }
    
    public void setAcademicProgress(String academicProgress){
        this.academicProgress = academicProgress == null ? "" : academicProgress.trim();
    }
    
}
