package chapter_14_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCountGUI {
    private static int count = 0;
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton clickButton = new JButton("Click me");
        clickButton.setSize(200,100);
        JButton resetButton = new JButton("Reset");
        JLabel label = new JLabel("Number of count: 0");
        frame.setSize(350,200);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setSize(350,200);
        panel.add(clickButton);
        panel.add(label);
        panel.add(resetButton);

        // Using lambda
        clickButton.addActionListener(e -> {
            count++;
            label.setText("Number of counts: " + count);
        });

        // using anonymous class
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Number of count: 0");
                count = 0;
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
