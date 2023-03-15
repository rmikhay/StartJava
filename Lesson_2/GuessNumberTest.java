import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Представьтесь");
        System.out.println("Введите имя первого игрока: ");
        String player1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String player2 = scanner.nextLine();
        GuessNumber game = new GuessNumber(player1, player2);
        String continuationGame = "yes";
        while (continuationGame.equals("yes")) {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                continuationGame = scanner.nextLine();
            } while (!continuationGame.equals("yes") && !continuationGame.equals("no"));
        }
    }
}
