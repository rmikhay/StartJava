package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = "yes";
        startCalculation();
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                startCalculation();
            }
        } while (!answer.equals("no"));
    }

    private static void startCalculation() {
        Calculator calculator = new Calculator();
        System.out.print("Введите математическое выражение: ");
        String[] problem = scanner.nextLine().split(" ");
        int a = Integer.parseInt(problem[0]);
        int b = Integer.parseInt(problem[2]);
        char sign = problem[1].charAt(0);
        double result = calculator.calculate(a, sign, b);
        if (result == (int) result) {
            System.out.printf("%d %c %d = %2.0f\n", a, sign, b, result);
        } else {
            System.out.printf("%d %c %d = %2.3f\n", a, sign, b, result);
        }
    }
}
