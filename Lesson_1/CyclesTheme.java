public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumOdd = 0;
        int sumEven = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10, num2 = 5, num3 = -1;
        int max = num1;
        int min = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            sumNum += lastDigit;
            num /= 10;
        }
        System.out.println(", сумма его цифр равна " + sumNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countNumberInLine = 0;
        for (int i = 1; i < 24; i += 2) {
            countNumberInLine++;
            System.out.printf("%3d", i);
            if (countNumberInLine == 5) {
                System.out.println();
                countNumberInLine = 0;
            }
        }
        if (countNumberInLine > 0) {
            for (int i = 5 - countNumberInLine; i <= 5; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        int countTwos = 0;
        int copyNum1 = num1;
        while (copyNum1 > 0) {
            if (copyNum1 % 10 == 2) {
                countTwos++;
            }
            copyNum1 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("число " + num1 + " содержит " + countTwos + " (четное) количество двоек");
        } else {
            System.out.println("число " + num1 + " содержит " + countTwos + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int numberLine = 0;
        int charsInLine = 0;
        while (numberLine < 5) {
            charsInLine = numberLine;
            while (charsInLine < 5) {
                System.out.print("#");
                charsInLine++;
            }
            System.out.println();
            numberLine++;
        }
        System.out.println();

        numberLine = 1;
        do {
            charsInLine = 3 - Math.abs(3 - numberLine);
            int currentSymbol = 0;
            do {
                System.out.print("$");
                currentSymbol += 1;
            } while (currentSymbol != charsInLine);
            System.out.println();
            numberLine += 1;
        } while (numberLine != 6);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.println("Dec" + " Char");
        for (int i = 1; i < 48; i += 2) {
            System.out.printf("%3d %3c\n", i, (char) i);
        }
        for (int i = 98; i < 122; i += 2) {
            System.out.printf("%3d %3c\n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 12321;
        int reverseNum = 0;
        int copyNum = num;
        while (copyNum > 0) {
            reverseNum = reverseNum * 10 + (copyNum % 10);
            copyNum /= 10;
        }
        if (num == reverseNum) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("число " + num + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 123600;
        copyNum = num;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        int leftHalf = num / 1000;
        int rightHalf = num % 1000;
        int digitNumber = 0;
        while (copyNum > 0) {
            int lastDigit = copyNum % 10;
            if (digitNumber < 3) {
                sumRightHalf += lastDigit;
            } else {
                sumLeftHalf += lastDigit;
            }
            copyNum /= 10;
            digitNumber++;
        }
        System.out.printf("Сумма цифр %03d равна %d\n", leftHalf, sumLeftHalf);
        System.out.printf("Сумма цифр %03d равна %d\n", rightHalf, sumRightHalf);
        if (sumLeftHalf == sumRightHalf) {
            System.out.println("Число " + num + " является счастливым");
        } else {
            System.out.println("Число " + num + " не является счастливым");
        }

        System.out.println("\nВывод таблицы умножения Пифагора");
        System.out.println("    ТАБЛИЦА ПИФАГОРА");
        System.out.print(" |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n-|");
        for (int i = 1; i < 25; i++) {
            System.out.print("-");
        }
        for (int i = 2; i < 10; i++) {
            System.out.print("\n" + i + "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
        }

    }
}
