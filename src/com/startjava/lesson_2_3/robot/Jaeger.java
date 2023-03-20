package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private double height;
    private double weight;
    private int speed;
    private int armor;
    private int strength;
    private int pilotsNumber;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, double height, double weight, int speed, int armor,
            int strength, int pilotsNumber) {
        this.modelName = modelName;
        this.mark = mark;
        setHeight(height);
        setWeight(weight);
        setSpeed(speed);
        setArmor(armor);
        setStrength(strength);
        setPilotsNumber(pilotsNumber);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Неверное значение");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Неверное значение");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Неверное значение");
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor > 0) {
            this.armor = armor;
        } else {
            System.out.println("Неверное значение");
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > 0) {
            this.strength = strength;
        } else {
            System.out.println("Неверное значение");
        }
    }

    public int getPilotsNumber() {
        return pilotsNumber;
    }

    public void setPilotsNumber(int pilotsNumber) {
        if (pilotsNumber > 0) {
            this.pilotsNumber = pilotsNumber;
        } else {
            System.out.println("Неверное значение");
        }
    }

    void killKaiju() {
        System.out.println("Уничтожен");
    }

    void move() {
        System.out.println("Шагнул вперед");
    }


}
