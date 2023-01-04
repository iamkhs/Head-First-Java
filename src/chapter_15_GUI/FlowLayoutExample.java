package chapter_15_GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        go();
    }

    private static void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        JButton button = new JButton("shock me ");
        JButton button2 = new JButton("bliss");
        panel.add(button);
        panel.add(button2);
        button.setSize(30,50);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.setSize(250,200);
        frame.setSize(250,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
