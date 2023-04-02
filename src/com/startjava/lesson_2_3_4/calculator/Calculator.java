package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String string) {
        String[] problem = string.split(" ");
        int a = Integer.parseInt(problem[0]);
        int b = Integer.parseInt(problem[2]);
        char sign = problem[1].charAt(0);
        switch (sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return (double) a / (double) b;
            case '^':
                return Math.pow(a, b);
            case '%':
                return a % b;
        }
        return 0;
    }
}
