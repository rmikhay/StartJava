import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;
    Scanner scanner = new Scanner(System.in);
    private int hiddenNumber;

    public GuessNumber(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

    public void start() {
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
        while (true) {
            enterNumber(player1);
            if (checkNumber(player1)) {
                break;
            }
            enterNumber(player2);
            if (checkNumber(player2)) {
                break;
            }
        }
    }

    public void enterNumber(Player player) {
        System.out.println(player.getName() + " вводит число");
        int number = scanner.nextInt();
        player.setNumber(number);
    }

    public boolean checkNumber(Player player) {
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Правильно, победил игрок " + player.getName());
            return true;
        } else if (hiddenNumber > player.getNumber()) {
            System.out.println("число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + player.getNumber() + " больше того, что загадал компьютер");
        }
        return false;
    }

}