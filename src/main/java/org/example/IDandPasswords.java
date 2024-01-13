package org.example;

import java.util.HashMap;

public class IDandPasswords {

    // create hash map
    // Key : Value
    // Username : Password
    HashMap<String, String> logininfo = new HashMap<String, String>();

    // constructor
    IDandPasswords() {
        // store logins credentials into the hash map
        logininfo.put("Bro", "pizza");
        logininfo.put("David", "123");
        logininfo.put("Amos", "Liberal");
    }

    // getter method for classes that request this
    protected HashMap getLoginInfo() {
        return logininfo;
    }

}
