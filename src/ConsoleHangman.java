import java.util.Scanner;

public class ConsoleHangman {
    public ConsoleHangman() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Start of ConsoleHangman\n");
        HangmanModel hangman = new HangmanModel(new BasicSetup());
        ConsoleHangmanView view = new ConsoleHangmanView();
        ConsoleHangmanView view2 = new ConsoleHangmanView();
        hangman.addView(view);
        hangman.addView(view2);

        do {
            System.out.println("Enter a character to try!");
            hangman.tryThis(scan.next().charAt(0));
        } while(!hangman.isGameOver());

        System.out.println("\nEnd of ConsoleHangman\n");
    }
}