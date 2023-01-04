package chapter_15_GUI;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox implements ItemListener {
    private static JCheckBox checkBox;
    private static JCheckBox checkBox2;

    public static void main(String[] args) {
        new CheckBox().go();
    }

    private void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350,300);
        frame.getContentPane().add(panel);

        checkBox = new JCheckBox("Goes to 11");
        checkBox.addItemListener(this);
        checkBox2 = new JCheckBox("Hello");
        checkBox2.addItemListener(this);

        panel.add(checkBox);
        panel.add(checkBox2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if (checkBox.isSelected()){
            onOrOff = "on";
        }
        System.out.println("Check box is "+ onOrOff);

        if (checkBox2.isSelected()){
            System.out.println("Hello world");
        }
    }
}
