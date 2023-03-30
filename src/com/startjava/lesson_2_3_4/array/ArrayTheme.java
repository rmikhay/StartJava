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
            intArray[i] = intArray[--len];
            intArray[len] = temp;
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
            productNumbers *= intArray[i];
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
        double middleCellNumber = doubleArray[len / 2];
        int numberResets = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArray[i] > middleCellNumber) {
                doubleArray[i] = 0;
                numberResets++;
            }
        }
        System.out.println("После изменения:");
        printArray(doubleArray);
        System.out.println("Количество измененных ячеек: " + numberResets);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        len = letters.length;
        for (int i = 0; i < len; i++) {
            letters[i] = (char) ('A' + i);
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letters[len - j - 1]);
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
            } while (isUnique(intArray, randomNumber));
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
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNonEmptyStrings = 0;
        len = srcStrings.length;
        for (String string : srcStrings) {
            if (!string.isBlank()) {
                countNonEmptyStrings++;
            }
        }
        String[] destStrings = new String[countNonEmptyStrings];
        int srcPos = 0;
        int destPos = 0;
        for (int i = 0; i < len; i++) {
            if (srcStrings[i].isBlank() || i == len - 1) {
                System.arraycopy(srcStrings, i - srcPos, destStrings,
                        destPos - srcPos, srcPos);
                srcPos = 0;
            } else {
                srcPos++;
                destPos++;
            }
        }
        System.out.println(Arrays.toString(srcStrings));
        System.out.println(Arrays.toString(destStrings));
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

    private static boolean isUnique(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }
}
