/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;
    String contactId;
    
    public Person(String id) {

        this.id = id;
        this.contactId = "";
    }

    public String getPersonId() {
        return id;
    }
    
    public void setPersonId(String id){
        this.id = id;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }
    @Override
    public String toString() {
        return getPersonId();
    }
}
