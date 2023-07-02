package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SignUp extends JFrame {
    Choice loginAsChoice;
    TextField meterText, employerText, userNameText, nameText, passwordText;
    SignUp(){
        super("Sign-Up Page");

        //Texts and TextFields
        JLabel createAs = new JLabel("Create Account As");
        createAs.setBounds(30, 50, 125, 20);
        add(createAs);

        //Drop Down List
        loginAsChoice = new Choice();
        loginAsChoice.add("Admin");
        loginAsChoice.add("Customer");
        loginAsChoice.setBounds(170, 50, 125, 20);
        add(loginAsChoice);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30, 100, 125, 20);
        meterNo.setVisible(false);
        add(meterNo);

        meterText = new TextField();
        meterText.setBounds(170, 100,125, 20);
        meterNo.setVisible(false);
        add(meterText);

        JLabel employer = new JLabel("Employer ID");
        employer.setBounds(30,100, 125, 20);
        employer.setVisible(true);
        add(employer);

        employerText = new TextField();
        employerText.setBounds(170, 100, 125, 20);
        employerText.setVisible(true);
        add(employerText);

        JLabel userName = new JLabel("Username");
        userName.setBounds(30, 145, 125, 20);
        add(userName);

        userNameText = new TextField();
        userNameText.setBounds(170, 145, 125, 20);
        add(userNameText);

        JLabel name = new JLabel("Name");
        name.setBounds(30, 190, 125, 20);
        add(name);

        nameText = new TextField();
        nameText.setBounds(170, 190, 125, 20);
        add(nameText);

        JLabel password = new JLabel("Password");
        password.setBounds(30, 235, 125, 20);
        add(password);

        passwordText = new TextField();
        passwordText.setBounds(170, 235, 125, 20);
        add(passwordText);

        loginAsChoice.addItemListener(e -> {
            String user = loginAsChoice.getSelectedItem();
            if(user.equals("Customer")){
                employer.setVisible(false);
                employerText.setVisible(false);
                meterNo.setVisible(true);
                meterText.setVisible(true);
            }
            else{
                employer.setVisible(true);
                employerText.setVisible(true);
                meterNo.setVisible(false);
                meterText.setVisible(false);
            }
        });


        setSize(600, 380);
        setLocation(650, 350);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignUp();
    }
}
