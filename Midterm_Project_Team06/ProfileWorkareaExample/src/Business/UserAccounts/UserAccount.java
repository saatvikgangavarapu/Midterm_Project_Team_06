/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    Profile profile;
    String username;
    String password;
    
    public UserAccount (Profile profile, String un, String pw){
        username = un;
         password = pw;
         this.profile = profile;

    }

    public String getPersonId(){
        return (profile != null && profile.getPerson() != null) ? profile.getPerson().getPersonId() : "";
    }
    public String getUserLoginName(){
        return username;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    public boolean IsValidUser(String un, String pw){
        if (un == null || pw == null) return false;
        if (username == null || password == null) return false;
        return username.equalsIgnoreCase(un) && password.equals(pw);
    }
    public String getRole(){
        return (profile != null) ? profile.getRole() : "";
    }

    public Profile getAssociatedPersonProfile(){
        return profile;
    }

    @Override
        public String toString(){
        return getUserLoginName();
    }
        public void setUserLoginName(String username){
            this.username = username;
        }
        
        public void setPassword(String password){
            this.password = password;
        }  
}

