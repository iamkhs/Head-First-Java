package chapter_14_GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimpleGui3 {
    private JFrame frame;

    public static void main(String[] args){
        SimpleGui3 gui = new SimpleGui3();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(e -> frame.repaint());

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

}


class  MyDrawPanel extends JPanel{
    public void paintComponent(Graphics graphics){
        Graphics2D g2d = (Graphics2D) graphics;

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color startColor = new Color(red, green, blue);

        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70,70, startColor, 150,150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
}
