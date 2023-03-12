import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1 = new Player();
    Player player2 = new Player();
    Scanner scanner = new Scanner(System.in);
    private int hiddenNumber;
    private boolean gameOver = false;

    private boolean introducedPlayers = false;

    public void generateNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(1, 101);
    }

    public void createPlayer() {
        System.out.println("Введите имя первого игрока: ");
        player1.createPlayer(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        player2.createPlayer(scanner.nextLine());
    }

    public void checkNumberPlayer1() {
        if (player1.getNumber() == hiddenNumber) {
            System.out.println("Правильно, победил игрок " + player1.getName());
            gameOver = true;
        } else if (hiddenNumber > player1.getNumber()) {
            System.out.println("число " + player1.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + player1.getNumber() + " больше того, что загадал компьютер");
        }
    }

    public void checkNumberPlayer2() {
        if (player2.getNumber() == hiddenNumber) {
            System.out.println("Правильно, победил игрок " + player2.getName());
            gameOver = true;
        } else if (hiddenNumber > player2.getNumber()) {
            System.out.println("число " + player2.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + player2.getNumber() + " больше того, что загадал компьютер");
        }
    }

    public void enterNumberPlayer1() {
        System.out.println(player1.getName() + " вводит число");
        player1.setNumber(scanner.nextInt());
    }

    public void enterNumberPlayer2() {
        System.out.println(player2.getName() + " вводит число");
        player2.setNumber(scanner.nextInt());
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void goPlayers() {
        while (true) {
            enterNumberPlayer1();
            checkNumberPlayer1();
            if (isGameOver()) {
                break;
            }
            enterNumberPlayer2();
            checkNumberPlayer2();
            if (isGameOver()) {
                break;
            }
        }
    }

    public void startGame() {
        if (!introducedPlayers) {
            System.out.println("Представьтесь");
            createPlayer();
            setIntroducedPlayers(true);
        }
        System.out.println("Компьютер загадал число");
        generateNumber();
        System.out.println("Загадано число " + getHiddenNumber());
        goPlayers();
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public boolean isIntroducedPlayers() {
        return introducedPlayers;
    }

    public void setIntroducedPlayers(boolean introducedPlayers) {
        this.introducedPlayers = introducedPlayers;
    }
}