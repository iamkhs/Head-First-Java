package chapter_14_GUI;

import javax.swing.*;
import java.awt.*;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
//        labelButton.addActionListener(new LabelListener());
        labelButton.addActionListener(e -> label.setText("Ouch")); // we can use lambdas instead of using inner class

        JButton colorButton = new JButton("Change Circle");
//        colorButton.addActionListener(new ColorListener());
        colorButton.addActionListener(e -> frame.repaint()); // we can use lambdas instead of using inner class

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500,400);
        frame.setVisible(true);
    }

//    class LabelListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            label.setText("Ouch!");
//        }
//    }
//
//    class ColorListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            frame.repaint();
//        }
//    }
}
