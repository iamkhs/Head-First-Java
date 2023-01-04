package chapter_15_GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List implements ListSelectionListener{
    private JList<String> myList;

    public static void main(String[] args) {
        new List().go();
    }

    private void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350,300);
        frame.getContentPane().add(panel);

        String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        myList = new JList<>(listEntries);

        JScrollPane scroller = new JScrollPane(myList);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        myList.setVisibleRowCount(4);
        myList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        myList.addListSelectionListener(this);


        panel.add(myList);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()){
            String selection = myList.getSelectedValue();
            System.out.println(selection);
        }
    }
}
