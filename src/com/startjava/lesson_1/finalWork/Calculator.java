package com.startjava.lesson_1.finalWork;

public class Calculator {

    public static void main(String[] args) {
        char sign = '/';
        int a = 5;
        int b = 6;
        int result = 0;
        double resultDiv = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            resultDiv = (double) a / (double) b;
        } else if (sign == '^') {
            result = pow(a, b);
        } else if (sign == '%') {
            result = a % b;
        }
        if (sign == '/') {
            System.out.printf("%d %c %d = %5.2f", a, sign, b, resultDiv);
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }

    public static int pow(int base, int pow) {
        int resultPow = 1;
        for (int i = 0; i < pow; i ++) {
            resultPow *= base;
        }
        return resultPow;
    }
}
