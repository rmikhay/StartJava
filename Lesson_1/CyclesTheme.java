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
        System.out.println(", сумма его цирф равна " + sumNum);

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
        if (countNumberInLine != 0) {
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
        int lineCounter = 0;
        int charInLine = 0;
        while (lineCounter < 5) {
            charInLine = lineCounter;
            while (charInLine < 5) {
                System.out.print("#");
                charInLine++;
            }
            System.out.println();
            lineCounter++;
        }
        System.out.println();
        lineCounter = 1;
        charInLine = 0;
        do {
            do {
                System.out.print("$");
                charInLine++;
            } while (charInLine != lineCounter);
            lineCounter++;
            charInLine = 0;
            System.out.println();
        } while (lineCounter <= 2);
        lineCounter = 0;
        charInLine = 0;
        do {
            do {
                System.out.print("$");
                charInLine++;
            } while (charInLine != 3 - lineCounter);
            lineCounter++;
            charInLine = 0;
            System.out.println();
        } while (lineCounter < 3);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.println("Dec" + " Char");
        for (int i = 1; i < 48; i += 2) {
            System.out.printf("%3d", i);
            char k = (char) i;
            System.out.println("   " + k);
        }
        for (int i = 98; i < 122; i += 2) {
            System.out.printf("%3d", i);
            char symbol = (char) i;
            System.out.println("   " + symbol);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 12321;
        num1 = 0;
        copyNum1 = num;
        int lenNum = 0;
        while (copyNum1 > 0) {
            copyNum1 /= 10;
            lenNum++;
        }
        copyNum1 = num;
        while (lenNum > 0) {
            int powTens = 1;
            for (int j = 1; j < lenNum; j++) {
                powTens *= 10;
            }
            num1 += (copyNum1 % 10) * powTens;
            copyNum1 /= 10;
            lenNum--;
        }
        if (num == num1) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("число " + num + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 123600;
        copyNum1 = num;
        int sumFirstThrees = 0;
        int sumSecondThrees = 0;
        int firstThrees = 0;
        int secondThrees = 0;
        int lastDigit;
        int powTens = 1;
        for (int i = 0; i < 3; i++) {
            lastDigit = copyNum1 % 10;
            sumSecondThrees += lastDigit;
            secondThrees += lastDigit * powTens;
            copyNum1 /= 10;
            powTens *= 10;
        }
        powTens = 1;
        for (int i = 0; i < 3; i++) {
            lastDigit = copyNum1 % 10;
            sumFirstThrees += lastDigit;
            firstThrees += lastDigit * powTens;
            powTens *= 10;
            copyNum1 /= 10;
        }
        System.out.println("Сумма цифр " + firstThrees + " равна " + sumFirstThrees);
        System.out.println("Сумма цифр " + secondThrees + " равна " + sumSecondThrees);
        if (sumFirstThrees == sumSecondThrees) {
            System.out.println("Число " + num + " явялется счастливым");
        } else {
            System.out.println("Число " + num + " не явялется счастливым");
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
