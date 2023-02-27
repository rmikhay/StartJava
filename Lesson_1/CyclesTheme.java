public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int oddSum = 0;
        int evenSum = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10, num2 = 5, num3 = -1;
        int maxNum = num1;
        int minNum = num1;
        if (num2 > maxNum) {
            maxNum = num2;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        if (num2 < minNum) {
            minNum = num2;
        }
        if (num3 < minNum) {
            minNum = num3;
        }
        for (i = minNum + 1; i < maxNum; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int defaultNumber = 1234;
        int numSum = 0;
        i = 0;
        while (i < 4) {
            System.out.print(defaultNumber % 10);
            numSum += defaultNumber % 10;
            defaultNumber /= 10;
            i++;
        }
        System.out.println(" сумму его цирф равна " + numSum);
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countLine = 0;
        for (i = 1; i < 24; i += 2) {
            countLine++;
            if (countLine != 5) {
                System.out.printf("%3d", i);
            } else {
                System.out.printf("%3d%n", i);
                countLine = 0;
            }
        }
        int nedoCOunt = 5 - countLine;
        for (i = countLine; i < 5; i++) {
            System.out.printf("%3d", 0);
        }
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        int countTwo = 0;
        int tmp = num1;
        while (tmp > 0) {
            if (tmp % 10 == 2) {
                countTwo++;
            }
            tmp /= 10;
        }
        if (countTwo % 2 == 0) {
            System.out.println("число " + num1 + " содержит " + countTwo + " (четное) количество двоек");
        } else {
            System.out.println("число " + num1 + " содержит " + countTwo + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        i = 0;
        int j = 0;
        while (i < 5) {
            j = i;
            while (j < 5) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        i = 1;
        j = 0;
        do {
            do {
                System.out.print("$");
                j++;
            } while (j != i);
            i++;
            j = 0;
            System.out.println();
        } while (i <= 2);
        i = 0;
        j = 0;
        do {
            do {
                System.out.print("$");
                j++;
            } while (j != 3 - i);
            i++;
            j = 0;
            System.out.println();
        } while (i < 3);
        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.println("Dec" + " Char");
        for (i = 1; i < 48; i += 2) {
            System.out.printf("%3d", i);
            char k = (char) i;
            System.out.println("   " + k);
        }
        for (i = 98; i < 122; i += 2) {
            System.out.printf("%3d", i);
            char k = (char) i;
            System.out.println("   " + k);
        }
        System.out.println("\n8. Проверка, является ли число палиндромом");
        defaultNumber = 12321;
        num1 = 0;
        tmp = defaultNumber;
        i = 0;
        int lenNum = 0;
        while (tmp > 0) {
            tmp /= 10;
            lenNum++;
        }
        tmp = defaultNumber;
        while (lenNum > 0) {
            int pow = 1;
            for (j = 1; j < lenNum; j++) {
                pow *= 10;
            }
            num1 += (tmp % 10) * pow;
            tmp /= 10;
            lenNum--;
        }
        if (defaultNumber == num1) {
            System.out.println("число " + defaultNumber + " является палиндромом");
        } else {
            System.out.println("число " + defaultNumber + " не является палиндромом");
        }
        System.out.println("\n9. Определение, является ли число счастливым");
        defaultNumber = 123600;
        tmp = defaultNumber;
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("Сумма цифр ");
        for (i = 0; i < 3; i++) {
            sum2 += tmp % 10;
            System.out.print(tmp % 10);
            tmp /= 10;
        }
        System.out.print(" равна " + sum2 + "\nСумма цифр ");
        for (i = 0; i < 3; i++) {
            sum1 += tmp % 10;
            System.out.print(tmp % 10);
            tmp /= 10;
        }
        System.out.println(" равна " + sum1);
        if (sum1 == sum2) {
            System.out.println("Число " + defaultNumber + " явялется счастливым");
        } else {
            System.out.println("Число " + defaultNumber + " не явялется счастливым");
        }
        System.out.println("\nВывод таблицы умножения Пифагора");
        System.out.println("    ТАБЛИЦА ПИФАГОРА");
        System.out.print(" |");
        for (i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n-|");
        for (i = 1; i < 25; i++) {
            System.out.print("-");
        }
        for (i = 2; i < 10; i++) {
            System.out.print("\n" + i + "|");
            for (j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
        }

    }
}
