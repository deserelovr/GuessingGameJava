import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        game.displayWelcomeMessage();

        String playAgain;
        do {
            game.generateNumberToBeGuessed();
            game.displayPleaseGuessMessage();

            while (true) {
                int guess = scanner.nextInt();
                game.makeGuess(guess);

                if (game.isCorrectGuess()) {
                    game.displayCorrectGuessMessage();
                    break;
                } else {
                    game.displayGuessAgainMessage();
                }
            }

            game.displayMessageBasedOnGuesses();
            System.out.println("Do you want to play again? (y/n)");
            playAgain = scanner.next();
        } while (!playAgain.equalsIgnoreCase("n"));
        System.out.println("\nBye!!");

        scanner.close();
    }
}
