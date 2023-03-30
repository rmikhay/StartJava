package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Представьтесь");
        System.out.println("Введите имя первого игрока: ");
        String namePlayer1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String namePlayer2 = scanner.nextLine();
        GuessNumber game = new GuessNumber(namePlayer1, namePlayer2);
        String continuationGame = "yes";
        game.start();
        do {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            continuationGame = scanner.nextLine();
            if (continuationGame.equals("yes")) {
                game.start();
            }
        } while (!continuationGame.equals("no"));
    }
}
