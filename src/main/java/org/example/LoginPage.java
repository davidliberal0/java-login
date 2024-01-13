package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    // constructor - accepts hashmap
    LoginPage(HashMap<String, String> loginInfoOriginal) {
        this.logininfo = loginInfoOriginal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
