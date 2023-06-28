package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JTextField userText, passwordText;
    Choice loginChoice;
    Login(){
        super("Login");

        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel username = new JLabel("Username");
        username.setBounds(300,60, 100, 20);
        add(username);

        userText = new JTextField();
        userText.setBounds(400,60, 100, 20);
        add(userText);

        JLabel password = new JLabel("Password");
        password.setBounds(300, 100, 100, 20);
        add(password);

        passwordText = new JTextField();
        passwordText.setBounds(400,100, 100, 20);
        add(passwordText);

        JLabel login = new JLabel("Log In As");
        login.setBounds(300, 140, 100, 20);
        add(login);

        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400, 140, 100, 20);
        add(loginChoice);


        ImageIcon profileOne = new ImageIcon(ClassLoader.getSystemResource("icon/Login/profile.png"));
        Image profile1 = profileOne.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon fprofile1 = new ImageIcon(profile1);
        JLabel profileLabel = new JLabel(fprofile1);
        profileLabel.setBounds(10,5, 250, 250);
        add(profileLabel);


        setSize(640, 300);
        setLocation(650,350);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Login();
    }
}
