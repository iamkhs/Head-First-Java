package chapter_06;

import java.util.ArrayList;

public class StartupBust {
    private final GameHelper helper = new GameHelper();
    private final ArrayList<Startup> startups = new ArrayList<>();
    private int numberOfGuess = 0;

    private void setUpGame(){
        // first make some Startups and give them locations
        Startup one = new Startup();
        one.setName("poniez");

        Startup two = new Startup();
        two.setName("hacqi");

        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Startup startup : startups){
            ArrayList<String> newLocations = helper.placeStartup(3);
            startup.setLocationCells(newLocations);
        }
    }


    private void startPlaying(){
        while (!startups.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }


    private void checkUserGuess(String userGuess){
        numberOfGuess++;
        String result = "miss";

        for (Startup startupToTest : startups){
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Starups are dead! Your stock is now worthless");
        if (numberOfGuess<= 18){
            System.out.println("It only took you "+ numberOfGuess + " guesses.");
            System.out.println("You got out before your options sank");
        }
        else{
            System.out.println("Took you long enough. "+numberOfGuess + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public  static void main(String[] args){
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}
