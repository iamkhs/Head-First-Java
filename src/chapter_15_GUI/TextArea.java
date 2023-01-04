package chapter_15_GUI;

import javax.swing.*;

public class TextArea {
    private static int count = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea text = new JTextArea(10,20);

        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);

        JButton button = new JButton("Click me");
        panel.add(button);

        button.addActionListener(e -> {
            count++;
            text.append("button clicked \n");
            if (count == 10) {
                button.setVisible(false);
                text.append("Too many operation");
            }
        });
        frame.setVisible(true);
    }
}
