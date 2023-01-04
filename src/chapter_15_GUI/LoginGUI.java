package chapter_15_GUI;

import javax.swing.*;

public class LoginGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login GUI");
        JPanel panel = new JPanel();

        panel.setLayout(null);
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.getContentPane().add(panel);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userField = new JTextField(20);
        userField.setBounds(100, 20, 165, 25);
        panel.add(userField);


        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField password = new JPasswordField();
        password.setBounds(100, 50, 165, 25);
        panel.add(password);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);

        JLabel successLabel = new JLabel("Login successfully");
        successLabel.setBounds(10,110,300,25);
        successLabel.setVisible(false);
        panel.add(successLabel);



        loginButton.addActionListener(e -> {
            if (userField.getText().equals("hello") && password.getText().equals("world")){
                successLabel.setVisible(true);
            }
            else{
                successLabel.setText("Not match");
                successLabel.setVisible(true);
            }
        });


        frame.setVisible(true);
    }
}
