package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    // Login Page UI
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        this.logininfo = loginInfoOriginal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
