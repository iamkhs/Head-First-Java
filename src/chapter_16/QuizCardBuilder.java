package chapter_16;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QuizCardBuilder {
    private ArrayList<QuizCard> cardList = new ArrayList<>();
    private JTextArea question;
    private JTextArea answer;
    private JFrame frame;

    public static void main (String[] args){
        new QuizCardBuilder().go();
    }

    private void go(){
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD,24);

        question = createTextArea(bigFont);
        JScrollPane qScroller = new JScrollPane(question);
        answer = createTextArea(bigFont);
        JScrollPane aScoller = createScroller(answer);

        mainPanel.add(new JLabel("Question"));
        mainPanel.add(qScroller);
        mainPanel.add(new JLabel("Answer"));
        mainPanel.add(qScroller);

        JButton nextButton = new JButton("Next card");
        nextButton.addActionListener(e -> nextCard());
        mainPanel.add(nextButton);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e -> clearAll());

        JMenuItem saveMenuItem = new JMenuItem("save");
        saveMenuItem.addActionListener(e -> {
            try {
                saveCard();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);
    }

    private JScrollPane createScroller(JTextArea textArea){
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return scrollPane;
    }

    private JTextArea createTextArea(Font font){
        JTextArea textArea = new JTextArea(6,20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(font);
        return textArea;
    }

    private void nextCard(){
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);
        clearCard();
    }

    private void saveCard() throws IOException {
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);

        JFileChooser fileSave = new JFileChooser();
        fileSave.showSaveDialog(frame);
        saveFile(fileSave.getSelectedFile());
    }


    private void clearAll(){
        cardList.clear();
        clearCard();
    }

    private void clearCard(){
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    private void saveFile(File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (QuizCard card : cardList){
            writer.write(card.getQuestion() + "/");
            writer.write(card.getAnswer() + "\n");
        }
        writer.close();
    }
}
