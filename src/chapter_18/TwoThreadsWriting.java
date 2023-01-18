package chapter_18;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwoThreadsWriting {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Data data = new Data();
        threadPool.execute(() -> addLetterToData('a', data));
        threadPool.execute(() -> addLetterToData('A', data));
        threadPool.shutdown();
    }

    private static void addLetterToData(char letter, Data data){
        for (int i = 0; i<26; i++){
            data.addLetter(letter++);
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + data.getLetters());
        System.out.println(Thread.currentThread().getName() + " size " + data.getLetters().size());
    }
}

final class Data{
    // Use a thread safe collection CopyOnWriteArrayList
    private final List<String> letters = new CopyOnWriteArrayList<>();

    public List<String> getLetters() {
        return letters;
    }

    public void addLetter(char letter){
        letters.add(String.valueOf(letter));
    }
}