package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    // Login Page UI --------------------------------

    // Component Instantiation
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel("This is a text");
    JLabel registerLabel = new JLabel("Register an Account...");
    JButton registerButton = new JButton("Register");
    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        this.logininfo = loginInfoOriginal;

        // Components Layout
        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        messageLabel.setBounds(125, 300, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        // register an account
        registerLabel.setBounds(150, 230, 250, 25);
        registerLabel.setFont(new Font(null, Font.ITALIC, 15));
        registerButton.setBounds(175, 255, 100, 25);
        registerButton.addActionListener(this);

        // login button layout
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);

        // reset button
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);

        // Add to frame
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(registerLabel);
        frame.add(registerButton);

        // frame attributes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Reset fields
        if (e.getSource() == resetButton) {
            userPasswordField.setText("");
            userIDField.setText("");
        }
        // Retrieve the credentials and validate
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("wrong password");
                }
            }
        } else {
            messageLabel.setForeground(Color.red);
            messageLabel.setText("User ID not Found!");
        }

        if (e.getSource() == registerButton) {
            frame.dispose();
            RegisterPage register = new RegisterPage();
        }

    }

}
