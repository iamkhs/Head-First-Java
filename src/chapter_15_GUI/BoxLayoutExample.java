package chapter_15_GUI;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        go();
    }

    private static void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton button1 = new JButton("bliss");

        panel.add(button);
        panel.add(button1);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setVisible(true);
        frame.setSize(250,200);
        panel.setSize(250,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
