import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;
    Scanner scanner = new Scanner(System.in);
    private int hiddenNumber;
    private boolean gameOver = false;
    private boolean introducedPlayers = false;

    public void startGame() {
        if (!introducedPlayers) {
            introducedPlayers = true;
        }
        System.out.println("Компьютер загадал число");
        generateNumber();
        System.out.println("Загадано число " + hiddenNumber);
        goPlayers();
    }

    public void generateNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(1, 101);
    }

    public void goPlayers() {
        gameOver = false;
        while (true) {
            player1.setNumber(enterNumber(player1.getName()));
            checkNumber(player1.getNumber(), player1.getName());
            if (gameOver) {
                break;
            }
            player2.setNumber(enterNumber(player2.getName()));
            checkNumber(player2.getNumber(), player2.getName());
            if (gameOver) {
                break;
            }
        }
    }

    public int enterNumber(String name) {
        System.out.println(name + " вводит число");
        return scanner.nextInt();
    }

    public void checkNumber(int number, String name) {
        if (number == hiddenNumber) {
            System.out.println("Правильно, победил игрок " + name);
            gameOver = true;
        } else if (hiddenNumber > number) {
            System.out.println("число " + number + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + number + " больше того, что загадал компьютер");
        }
    }

    public GuessNumber(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

}