import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner = new Scanner(System.in);
    static String player1;
    static String player2;

    public static void main(String[] args) {
        createPlayer();
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String continuationGame = "yes";
        while (continuationGame.equals("yes")) {
            guessNumber.startGame();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                continuationGame = scanner.nextLine();
            } while (!continuationGame.equals("yes") && !continuationGame.equals("no"));
        }
    }

    public static void createPlayer() {
        System.out.println("Представьтесь");
        System.out.println("Введите имя первого игрока: ");
        player1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        player2 = scanner.nextLine();
    }
}
