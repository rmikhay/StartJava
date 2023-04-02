package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempts;
    private int[] numbers;

    public Player(String name, int countAttempts) {
        this.name = name;
        numbers = new int[countAttempts];
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getNumber() {
        return numbers[attempts - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public void addNumber(int number) {
        numbers[attempts - 1] = number;
    }

    public void dataReset() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}
