package chapter_15_GUI;

import javax.swing.*;
import java.awt.*;

public class TextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(20);
        JLabel label = new JLabel("Enter your name");
        panel.add(label);
        panel.add(textField);


        frame.setSize(350,200);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
