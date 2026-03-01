/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.StudentProf;

import java.util.ArrayList;

/**
 *
 * @author Saatvik Gangavarapu
 */
public class StudentProfDirectory {

    private ArrayList<StudentProf> ec;

    public StudentProfDirectory() {
        ec = new ArrayList<>();
    }

    public StudentProf findByStudentId(String studentId) {
        if (studentId == null) return null;
        for (StudentProf p : ec) {
            if (studentId.equals(p.getStudentId())) return p;
        }
        return null;
    }

    public StudentProf findCreate(String studentId) {
        StudentProf existing = findByStudentId(studentId);
        if (existing != null) return existing;
        StudentProf created = new StudentProf(studentId);
        ec.add(created);
        return created;
    }

    public ArrayList<StudentProf> getAll() {
        return ec;
    }
}
