package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);
    private int hiddenNumber;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        this.player1 = new Player(namePlayer1);
        this.player2 = new Player(namePlayer2);
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
        while (true) {
            enterNumber(player1);
            if (compareNumbers(player1)) {
                break;
            }
            enterNumber(player2);
            if (compareNumbers(player2)) {
                break;
            }
        }
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " вводит число");
        int number = scanner.nextInt();
        player.setNumber(number);
    }

    private boolean compareNumbers(Player player) {
        int number = player.getNumber();
        if (number == hiddenNumber) {
            System.out.println("Правильно, победил игрок " + player.getName());
            return true;
        }
        if (hiddenNumber > number) {
            System.out.println("число " + number + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + number + " больше того, что загадал компьютер");
        }
        return false;
    }
}