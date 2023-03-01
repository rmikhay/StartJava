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
            System.out.println("Высоский");
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
        int num2STens = (num2 / 10) % 10;
        int num1Ones = num1 % 10;
        int num2Ones = num2 % 10;
        System.out.println(num1 + " " + num2);
        if (num1Hundred != num2Hundred && num1Tens != num2STens && num1Ones != num2Ones) {
            System.out.println("Нет равных чисел");
        } else {
            if (num1Hundred == num2Hundred) {
                System.out.println(num1Hundred + " " + 1 + " разряд");
            }
            if (num1Tens == num2STens) {
                System.out.println(num1Tens + " " + 2 + " разряд");
            }
            if (num1Ones == num2Ones) {
                System.out.println(num1Ones + " " + 3 + " разряд");
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
        double percent;
        if (sum < 100_000) {
            percent = Math.round(sum * 0.05);
        } else if (sum <= 300_000) {
            percent = Math.round(sum * 0.07);
        } else {
            percent = Math.round(sum * 0.1);
        }
        double sumTotal = sum + percent;
        System.out.println("Сумма равна " + sum + ", начисленный процент " + percent + ", итоговая сумма " +
                sumTotal);
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyBall = 0;
        int progBall = 0;
        if (historyPercent <= 60) {
            historyBall = 2;
        } else if (historyPercent <= 73) {
            historyBall = 3;
        } else if (historyPercent <= 91) {
            historyBall = 4;
        } else {
            historyBall = 5;
        }
        if (programmingPercent <= 60) {
            progBall = 2;
        } else if (programmingPercent <= 73) {
            progBall = 3;
        } else if (programmingPercent <= 91) {
            progBall = 4;
        } else {
            progBall = 5;
        }
        double average = (progBall + historyBall) / 2;
        double averagePersent = (programmingPercent + historyPercent) / 2;
        System.out.println(historyBall + " история\n" + progBall + " программирование");
        System.out.println("Средний балл равен " + average + "\nсредний процент равен " + averagePersent);

        System.out.println("\n8. Расчет прибыли за год");
        int arenda = 5000;
        int sale = 13000;
        int costPrice = 9000;
        int profit = (sale - costPrice - arenda) * 12;
        if (profit >= 0) {
            System.out.println("прибыль за год: +" + profit + " руб.");
        } else {
            System.out.println("прибыль за год: " + profit + " руб.");
        }
        System.out.println("\n9. Подсчет количества банкнот");
        int money = 567;
        int doll_100 = 10;
        int doll_10 = 10;
        int doll_1 = 50;
        int temp = money;
        int money100 = 0, money10 = 0, money1 = 0;
        int atmBalance = doll_1 + doll_10 * 10 + doll_100 * 100;
        if (atmBalance >= money) {
            money100 = temp / 100;
            if (doll_100 >= money100) {
                temp -= money100 * 100;
            } else {
                temp -= doll_100 * 100;
                money100 = doll_100;
            }
            money10 = temp / 10;
            if (doll_10 >= money10) {
                temp -= money10 * 10;
            } else {
                temp -= doll_10 * 10;
                money10 = doll_10;
            }
            money1 = temp;
            if (doll_1 >= money1) {
                temp -= money1;
            } else {
                temp -= doll_1;
                money10 = doll_1;
            }
        }
        if (temp == 0) {
            System.out.println("100$ - " + money100 + ", 10$ - " + money10 + ", 1$ - " + money1 + ". Сумма: " + money);
        } else {
            System.out.println("Денег не хватит");
        }

    }
}
