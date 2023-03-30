package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(int a, char sign, int b) {
        double result = 0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = Math.subtractExact(a, b);
                break;
            case '*':
                result = Math.multiplyExact(a, b);
                break;
            case '/':
                result = (double) a / (double) b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
        }
        return result;
    }
}
