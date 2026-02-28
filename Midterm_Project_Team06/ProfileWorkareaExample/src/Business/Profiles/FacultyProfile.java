/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;
import Business.Person.Person;

/**
 *
 * @author sashajohnson
 */
public class FacultyProfile extends Profile{
    public FacultyProfile(Person p) {
        super(p);
    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    @Override
    public boolean isMatch(String id) {
        return getPerson() != null && getPerson().getPersonId() != null && getPerson().getPersonId().equals(id);
    }
}
