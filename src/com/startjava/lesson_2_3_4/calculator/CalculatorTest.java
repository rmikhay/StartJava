package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = "yes";
        do {
            startCalculation();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }

    private static void startCalculation() {
        Calculator calculator = new Calculator();
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите знак математической операции: ");
        char sign = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        calculator.calculate(a, sign, b);
    }
}
