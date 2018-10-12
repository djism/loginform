package com.stackroute.model;

//import javax.validation.constraints.Past;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;

import java.util.ArrayList;
import java.util.Date;

public class User {

    //@Pattern(regexp = "[^0-9]*",message ="Enter a valid name.")
    private String userName;

    //@Size(min = 8,message = "password should be of atleast 8 characters")
    private String userPassword;

    //@Size(min = 10,max = 10,message = "phone number should be of length 10.")
    private Long userPhone;

    //@Past(message = "dob you entered is in future.Enter a valid dob.")
    private Date userDOB;

    private ArrayList<String> userSkills;

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public Date getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(Date userDOB) {
        this.userDOB = userDOB;
    }

    public ArrayList<String> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(ArrayList<String> userSkills) {
        this.userSkills = userSkills;
    }
}
