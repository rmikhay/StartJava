import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        String continuationGame = "yes";
        while (continuationGame.equals("yes")) {
            guessNumber.startGame();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                continuationGame = scanner.nextLine();
            } while (!continuationGame.equals("yes") && !continuationGame.equals("no"));
        }
    }
}
