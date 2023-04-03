package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                startCalculation();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    private static void startCalculation() {
        Calculator calculator = new Calculator();
        System.out.print("Введите математическое выражение: ");
        String task = scanner.nextLine();
        double result = calculator.calculate(task);
        if (result == (int) result) {
            System.out.printf("%s = %2.0f\n", task, result);
        } else {
            System.out.printf("%s = %2.3f\n", task, result);
        }
    }
}
