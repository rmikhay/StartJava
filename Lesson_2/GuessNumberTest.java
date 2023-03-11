import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        String continuationGame = "yes";
        System.out.println("Представьтесь");
        guessNumber.createPlayer();
        while (continuationGame.equals("yes")) {
            guessNumber.setGameOver(false);
            System.out.println("Компьютер загадал число");
            guessNumber.generateNumber();
            System.out.println("Загадано число " + guessNumber.getHiddenNumber());
            while (true) {
                guessNumber.enterNumberPlayer1();
                guessNumber.checkNumberPlayer1();
                if (guessNumber.isGameOver()) {
                    break;
                }
                guessNumber.enterNumberPlayer2();
                guessNumber.checkNumberPlayer2();
                if (guessNumber.isGameOver()) {
                    break;
                }
            }
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                continuationGame = scanner.nextLine();
            } while (!continuationGame.equals("yes") && !continuationGame.equals("no"));
        }
    }
}
