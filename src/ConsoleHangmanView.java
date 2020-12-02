
import cs102.Hangman;

public class ConsoleHangmanView implements IHangmanView {
    public ConsoleHangmanView() {
    }

    public void updateView(Hangman hangmanModel) {
        if (hangmanModel.getUsedLetters().length() == 0) {
            System.out.println("Welcome! Here is your word: " + hangmanModel.getKnownSoFar());
        } else if (!hangmanModel.isGameOver()) {
            System.out.println("You only discovered: " + hangmanModel.getKnownSoFar());
            System.out.println("You have " + (hangmanModel.getMaxAllowedIncorrectTries() - hangmanModel.getNumOfIncorrectTries()) + " tries left. ");
        } else if (hangmanModel.hasLost()) {
            System.out.println("You lost!! :(");
        } else if (hangmanModel.isGameOver()) {
            System.out.println("You won!");
        }

    }
}