package electricity.billing.system;

import javax.swing.*;

public class Login extends JFrame {
    Login(){
        super("Login");

        JLabel username = new JLabel("Username");
        username.setBounds(300,60, 100, 20);
        add(username);

        JTextField userText = new JTextField();
        userText.setBounds(400,60, 100, 20);
        add(userText);

        JLabel password = new JLabel("Password");
        password.setBounds(300, 100, 100, 20);
        add(password);

        JTextField passwordText = new JTextField();
        passwordText.setBounds(400,100, 100, 20);
        add(passwordText);

        JLabel login = new JLabel("Log In As");
        login.setBounds(300, 140, 100, 20);
        add(login);


        setSize(640, 300);
        setLocation(650,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Login();
    }
}
