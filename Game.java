import java.util.Random;
import java.util.Scanner;


public class Game {

    // This is to hold the number that the 'Game' class selected (thought of)
    int gameSelectedNumber;
    int numberOfAttempts = 0;

    // Start method
    public void start() {
        // Print a welcome message
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name here:");
        String name = scanner.nextLine();
        System.out.println("Hello there "+name+"! Let's play a game. You have 10 attempts to guess the number that I have in mind.");
        System.out.println("Here we go ...");

        // 'Select' a number for this session
        Random randomGenerator = new Random();
        gameSelectedNumber = randomGenerator.nextInt(100);

        while(numberOfAttempts < 10) {
            // Ask the user for a number
            int guess = getUserInput();

            // Count this as an attempt
          numberOfAttempts++;
            System.out.println(name+" you have used up "+numberOfAttempts+"/10");

            // Check if the number is correctly guessed
            if (guess == gameSelectedNumber) {
                System.out.println("Congratulations "+name+" You guessed it in " + numberOfAttempts + " attempts");
                System.exit(0);
            } else {
                // Check is any attempts left
                if (numberOfAttempts < 10) {
                    if (guess > gameSelectedNumber) {
                        System.out.println(name+" your guess is higher!");
                    } else {
                        System.out.println(name+" your guess is lower!");
                    }
                } else {
                    // print the Sorry message with the gameSelectedNumber
                    System.out.println("Sorry " +name+" you ran out of attempts. The number was : " + gameSelectedNumber);
                }
            }
        }
    }

    private int getUserInput() {
        System.out.println("Enter your guess : ");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();

        return userGuess;
    }
}



