package chapter_14_GUI;

import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First GUI Program");
        JButton button = new JButton("Click Me");

        // Set the preferred size of the button
        button.setPreferredSize(new Dimension(100, 100));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(500,500);

        // Let the layout manager handle the size and position of the components
        frame.setVisible(true);

        button.addActionListener(e -> button.setText("I am clicked"));

    }
}
