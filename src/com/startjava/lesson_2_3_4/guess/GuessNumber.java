package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);
    private int hiddenNumber;
    private final int countAttempts = 3;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        this.player1 = new Player(namePlayer1, countAttempts);
        this.player2 = new Player(namePlayer2, countAttempts);
    }

    public void start() {
        System.out.println("Компьютер загадал число");
        generateNumber();
        System.out.println("Загадано число " + hiddenNumber);
        startGameplay();
    }

    private void generateNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(1, 101);
    }

    private void startGameplay() {
        System.out.println("У каждого игрока по " + countAttempts + " попыток");
        while (player1.getAttempts() != countAttempts) {
            enterNumber(player1);
            if (compareNumbers(player1)) {
                break;
            }
            compareAttempts(player1);
            enterNumber(player2);
            if (compareNumbers(player2)) {
                break;
            }
            compareAttempts(player2);
        }
        printNumbers(player1);
        printNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " вводит число");
        int number = scanner.nextInt();
        player.addNumber(number);
    }

    private boolean compareNumbers(Player player) {
        int number = player.getNumber();
        if (number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с "
                    + player.getAttempts() + " попытки");
            return true;
        }
        if (hiddenNumber > number) {
            System.out.println("число " + number + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + number + " больше того, что загадал компьютер");
        }
        return false;
    }

    private void compareAttempts(Player player) {
        if (player.getAttempts() == countAttempts) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void printNumbers(Player player) {
        int[] copyNumbers = player.getNumbers();
        for (int number : copyNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}