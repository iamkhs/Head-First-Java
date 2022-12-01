package chapter_05;

import java.util.Scanner;

public class SimpleStartupTest {
    public static void main(String[] args){
        int numOfGuess = 0;
        SimpleStartup theStartup = new SimpleStartup();

        int random = (int)(Math.random() * 5);

        int [] locations = {random, random + 1, random + 2};
        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive){
            Scanner input = new Scanner(System.in);
            System.out.println("enter a number : ");
            int guess = input.nextInt();

            String result = theStartup.checkYourself(guess);
            numOfGuess++;

            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took "+ numOfGuess + " guesses");
            }
        }
    }
}
