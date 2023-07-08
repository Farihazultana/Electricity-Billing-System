package electricity.billing.system;

import javax.swing.*;
import java.awt.*;


public class SignUp extends JFrame {
    Choice loginAsChoice;
    TextField meterText, employerText, userNameText, nameText, passwordText;
    JButton create, back;
    SignUp(){
        super("Sign-Up Page");

        getContentPane().setBackground(new Color(168, 203, 255));

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

        create = new JButton("Create");
        create.setBackground(new Color(79, 142, 238)); //changed button background color
        create.setForeground(Color.white); //change text color
        create.setBounds(50, 285, 100, 25);
        add(create);

        back = new JButton("Back");
        back.setBackground(new Color(79, 142, 238));
        back.setForeground(Color.white);
        back.setBounds(180, 285, 100, 25);
        add(back);

        // Add Image
        ImageIcon boyIcon = new ImageIcon(ClassLoader.getSystemResource("icon/SignUp/boy.png"));
        Image boyImg = boyIcon.getImage().getScaledInstance(250, 250,  Image.SCALE_DEFAULT);
        ImageIcon signUpIcon = new ImageIcon(boyImg);
        JLabel signUpLabel = new JLabel(signUpIcon);
        signUpLabel.setBounds(320, 45, 250, 250);
        add(signUpLabel);

        setSize(600, 380);
        setLocation(650, 350);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignUp();
    }
}
