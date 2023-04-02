package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);
    private int hiddenNumber;
    private int countAttempts = 10;

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
            enterNumber(player2);
            if (compareNumbers(player2)) {
                break;
            }
        }
        printNumbers(player1);
        printNumbers(player2);
        player1.dataReset();
        player2.dataReset();
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " вводит число");
        int number = scanner.nextInt();
        player.setAttempts(player.getAttempts() + 1);
        player.addNumber(number);
    }

    private boolean compareNumbers(Player player) {
        int number = player.getNumber();
        if (number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber +
                    " с " + player.getAttempts() + " попытки");
            return true;
        }
        if (player.getAttempts() == 0) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        if (hiddenNumber > number) {
            System.out.println("число " + number + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + number + " больше того, что загадал компьютер");
        }
        return false;
    }

    private void printNumbers(Player player) {
        int[] array = player.getNumbers();
        for (int i = 0; i < array.length; i++) {
            System.out.print(player.getNumbers()[i] + " ");
        }
        System.out.println();
    }
}