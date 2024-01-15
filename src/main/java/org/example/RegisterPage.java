package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel registerPageTitle = new JLabel("Register a New User");
    JLabel userIDRegisterLabel = new JLabel("User ID:");
    JLabel userPasswordRegisterLabel = new JLabel("Password:");
    JTextField usernameRegister = new JTextField();
    JPasswordField passwordRegister = new JPasswordField();
    JButton registerUser = new JButton();


    RegisterPage() {

        // Components Layout
        registerPageTitle.setBounds(100, 50, 250, 30);
        registerPageTitle.setFont(new Font(null, Font.ITALIC, 25));
        userIDRegisterLabel.setBounds(50, 100, 75, 25);
        userPasswordRegisterLabel.setBounds(50, 150, 75, 25);
        // Text fields

        // Register button

        // Add to frame
        frame.add(userIDRegisterLabel);
        frame.add(userPasswordRegisterLabel);
        frame.add(registerPageTitle);

        // frame attributes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
