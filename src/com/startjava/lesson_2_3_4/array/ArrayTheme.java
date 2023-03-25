package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {2, 5, 1, 7, 3, 4, 6};
        printArray(intArray);
        int len = intArray.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[len - i - 1];
            intArray[len - i - 1] = temp;
        }
        printArray(intArray);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        len = intArray.length;
        for (int i = 0; i < len; i++) {
            intArray[i] = i;
        }
        int productNumbers = 1;
        for (int i = 1; i < len - 1; i++) {
            if (intArray[i] != 0 && intArray[i] != 9) {
                productNumbers *= intArray[i];
            }
            System.out.print(intArray[i] + (i < (len - 2) ? " * " : (" = " + productNumbers)));
        }
        System.out.println("\n" + intArray[0] + " " + intArray[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArray = new double[15];
        len = doubleArray.length;
        for (int i = 0; i < len; i++) {
            doubleArray[i] = Math.random();
        }
        System.out.println("До изменения:");
        printArray(doubleArray);
        double middleElement = doubleArray[len / 2];
        int emptyElements = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArray[i] > middleElement) {
                doubleArray[i] = 0;
                emptyElements++;
            }
        }
        System.out.println("После изменения:");
        printArray(doubleArray);
        System.out.println("Количество измененных ячеек: " + emptyElements);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] books = new char[26];
        len = books.length;
        for (int i = 0; i < len; i++) {
            books[i] = (char) ('A' + i);
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(books[len - j - 1]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        Random random = new Random();
        intArray = new int[30];
        len = intArray.length;
        int randomNumber;
        for (int i = 0; i < len; i++) {
            do {
                randomNumber = random.nextInt(60, 100);
            } while (checkNumberInArray(intArray, randomNumber));
            intArray[i] = randomNumber;
        }
        Arrays.sort(intArray);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\n\n6. Копирование не пустых строк");
        String[] stringArray = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int lenNewArray = 0;
        len = stringArray.length;
        for (String element : stringArray) {
            if (!element.isBlank()) {
                lenNewArray++;
            }
        }
        String[] newStringArray = new String[lenNewArray];
        int counter = 0;
        int sizeNewArray = 0;
        for (int i = 0; i < len; i++) {
            if (!stringArray[i].isBlank()) {
                counter++;
                sizeNewArray++;
            }
            if (stringArray[i].isBlank() || i == len - 1) {
                System.arraycopy(stringArray, i - counter, newStringArray, sizeNewArray - counter, counter);
                counter = 0;
            }
        }
        System.out.println(Arrays.deepToString(stringArray));
        System.out.println(Arrays.deepToString(newStringArray));
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length / 2) {
                System.out.printf("%2.3f ", array[i]);
            } else {
                System.out.printf("%2.3f \n", array[i]);
            }
        }
        System.out.println();
    }

    private static boolean checkNumberInArray(int[] array, int number) {
        boolean result = false;
        for (int element : array) {
            if (element == number) {
                result = true;
                break;
            }
        }
        return result;
    }
}
