package com.startjava.lesson_2_3_4.guess;

public class Player {

    private String name;
    private int number;
    private int attempts = 0;
    private int[] numbers;

    public Player(String name, int countAttempts) {
        this.name = name;
        numbers = new int[countAttempts];
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumbers(int attempt, int number) {
        this.numbers[attempt - 1] = number;
    }
}
