import java.util.Random;

public class Game {
    private int number;
    private int guessNumber;
    private int counter;
    // Constructor
    public Game() {
        this.number = 0;
        this.guessNumber = 0;
        this.counter = 0;
    }
    // Method to generate a random number between 1 and 100
    public void generateNumberToBeGuessed() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;
    }

    // Method to set the guessed number
    public void makeGuess(int guessNumber) {
        this.guessNumber = guessNumber;
        this.counter++;
    }

    // Method to check if the guess is correct
    public boolean isCorrectGuess() {
        return this.guessNumber == this.number;
    }

    // Method to display welcome message
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Guess Number Game!");
    }

    // Method to display message asking for guess
    public void displayPleaseGuessMessage() {
        System.out.println("Please guess a number between 1 and 100:");
    }

    // Method to display message for correct guess
    public void displayCorrectGuessMessage() {
        System.out.println("Congratulations! You've guessed the number " + this.number + " correctly!");
    }

    // Method to display message for incorrect guess
    public void displayGuessAgainMessage() {
        int difference = Math.abs(this.number - this.guessNumber);
        if (difference > 10) {
            if (this.guessNumber > this.number) {
                System.out.println("Way too high! Guess again.");
            } else {
                System.out.println("Way too low! Guess again.");
            }
        } else {
            if (this.guessNumber > this.number) {
                System.out.println("Too high! Guess again.");
            } else {
                System.out.println("Too low! Guess again.");
            }
        }
    }

    // Method to display message based on the number of guesses
    public void displayMessageBasedOnGuesses() {
        if (this.counter <= 3) {
            System.out.println("Great work! You are a mathematical wizard.");
        } else if (this.counter >= 4 && this.counter <= 7) {
            System.out.println("Not too bad! You've got some potential.");
        } else {
            System.out.println("What took you so long?");
        }
    }
}
