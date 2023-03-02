public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 25;
        boolean maleGender = true;
        double height = 1.84;
        String name = "Roman";
        if (age > 20) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }
        if (maleGender) {
            System.out.println("Man");
        } else {
            System.out.println("Woman");
        }
        if (height > 1.80) {
            System.out.println("Высокий");
        } else {
            System.out.println("Низкий");
        }
        char firstCharOfName = name.charAt(0);
        if (firstCharOfName == 'M') {
            System.out.println("Michel");
        } else if (firstCharOfName == 'I') {
            System.out.println("Ivan");
        } else {
            System.out.println("Unknown");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("max = " + num1 + ", min = " + num2);
        } else if (num2 > num1) {
            System.out.println("max = " + num2 + ", min = " + num1);
        } else {
            System.out.println("Равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = 34;
        System.out.println(num1);
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
            if (num > 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
        } else {
            System.out.println("Это " + num);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 223;
        int num1Hundred = num1 / 100;
        int num2Hundred = num2 / 100;
        int num1Tens = (num1 / 10) % 10;
        int num2Tens = (num2 / 10) % 10;
        int num1Ones = num1 % 10;
        int num2Ones = num2 % 10;
        System.out.println(num1 + " " + num2);
        if (num1Hundred != num2Hundred && num1Tens != num2Tens && num1Ones != num2Ones) {
            System.out.println("Нет равных чисел");
        } else {
            if (num1Hundred == num2Hundred) {
                System.out.println(num1Hundred + " 3 разряд");
            }
            if (num1Tens == num2Tens) {
                System.out.println(num1Tens + " 2 разряд");
            }
            if (num1Ones == num2Ones) {
                System.out.println(num1Ones + " 1 разряд");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.println(symbol);
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("число");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int sum = 300_000;
        double percent =sum * 0.1;
        if (sum < 100_000) {
            percent = sum * 0.05;
        } else if (sum <= 300_000) {
            percent = sum * 0.07;
        }
        percent = (int) percent;
        double sumTotal = sum + percent;
        System.out.println("Сумма равна " + sum + ", начисленный процент " + percent + ", итоговая сумма " +
                sumTotal);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyBall = 5;
        int progBall = 5;
        if (historyPercent <= 60) {
            historyBall = 2;
        } else if (historyPercent <= 73) {
            historyBall = 3;
        } else if (historyPercent <= 91) {
            historyBall = 4;
        }
        if (programmingPercent <= 60) {
            progBall = 2;
        } else if (programmingPercent <= 73) {
            progBall = 3;
        } else if (programmingPercent <= 91) {
            progBall = 4;
        }
        double averageBall = (progBall + historyBall) / 2;
        double averagePersent = (programmingPercent + historyPercent) / 2;
        System.out.println(historyBall + " история\n" + progBall + " программирование");
        System.out.println("Средний балл равен " + averageBall + "\nсредний процент равен " + averagePersent);

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int sale = 13000;
        int costPrice = 9000;
        int profit = (sale - costPrice - rent) * 12;
        if (profit >= 0) {
            System.out.println("прибыль за год: +" + profit + " руб.");
        } else {
            System.out.println("прибыль за год: " + profit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int money = 567;
        int dollarHundred = 10;
        int dollarTens = 10;
        int dollarOnes = 50;
        int balanceInWallet = money;
        int money100 = 0, money10 = 0, money1 = 0;
        int atmBalance = dollarOnes + dollarTens * 10 + dollarHundred * 100;
        if (atmBalance >= money) {
            money100 = balanceInWallet / 100;
            if (dollarHundred >= money100) {
                balanceInWallet -= money100 * 100;
            } else {
                balanceInWallet -= dollarHundred * 100;
                money100 = dollarHundred;
            }
            money10 = balanceInWallet / 10;
            if (dollarTens >= money10) {
                balanceInWallet -= money10 * 10;
            } else {
                balanceInWallet -= dollarTens * 10;
                money10 = dollarTens;
            }
            money1 = balanceInWallet;
            if (dollarOnes >= money1) {
                balanceInWallet -= money1;
            } else {
                balanceInWallet -= dollarOnes;
                money10 = dollarOnes;
            }
        }
        if (balanceInWallet == 0) {
            System.out.println("100$ - " + money100 + ", 10$ - " + money10 + ", 1$ - " + money1 +
                    ". Сумма: " + money);
        } else {
            System.out.println("Денег не хватит");
        }

    }
}
