public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Перевод псевдокода на язык Java (это название задачи)");
        int age = 25;
        boolean man = true;
        double height = 1.84;
        String name = "Roman";
        if (age > 20) {
            System.out.println("МОжно");
        } else {
            System.out.println("Нельзя");
        }
        if (man) {
            System.out.println("Man");
        } else {
            System.out.println("Woman");
        }
        if (height > 1.80) {
            System.out.println("Выоский");
        } else {
            System.out.println("Низкий");
        }
        char firstName = name.charAt(0);
        if (firstName == 'M') {
            System.out.println("Michel");
        } else if (firstName == 'I') {
            System.out.println("Ivan");
        } else {
            System.out.println("Unknown");
        }

        System.out.println("\nПоиск max и min числа");
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("max = " + num1 + ", min = " + num2);
        } else if (num2 > num1) {
            System.out.println("max = " + num2 + ", min = " + num1);
        } else {
            System.out.println("Равны");
        }
        System.out.println("\nПроверка числа");
        num1 = 34;
        System.out.println(num1);
        if (num1 != 0) {
            if (num1 % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
            if (num1 > 0) {
                System.out.println("ПОложительное");
            } else {
                System.out.println("Отрицательное");
            }
        } else {
            System.out.println("Это 0");
        }
        System.out.println("\nПоиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 223;
        int a1 = num1 / 100;
        int b1 = num2 / 100;
        int a2 = (num1 / 10) % 10;
        int b2 = (num2 / 10) % 10;
        int a3 = num1 % 10;
        int b3 = num2 % 10;
        boolean equal = false;
        System.out.println(num1 + " " + num2);
        if (a1 == b1) {
            System.out.println(a1 + " " + 1 + " разряд");
            equal = true;
        }
        if (a2 == b2) {
            System.out.println(a2 + " " + 2 + " разряд");
            equal = true;
        }
        if (a3 == b3) {
            System.out.println(a3 + " " + 3 + " разряд");
            equal = true;
        }
        if (equal == false) {
            System.out.println("Нет равных чисел");
        }

        System.out.println("\nОпределение символа по его коду");
        char sym = '\u0057';
        System.out.println(sym);
        if (sym >= '0' && sym <= '9') {
            System.out.println("число");
        } else if (sym >= 'A' && sym <= 'Z') {
            System.out.println("большая буква");
        } else if (sym >= 'a' && sym <= 'z') {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\nПодсчет суммы вклада и начисленных банком %");
        int sumka = 300_000;
        if (sumka < 100_000) {
            double percent = Math.round(sumka * 0.05);
            double itog = sumka + percent;
            System.out.println("Сумма равна " + sumka + ", начисленный процент " + percent + ", итоговая сумма " + itog);
        } else if (sumka <= 300_000) {
            double percent = Math.round(sumka * 0.07);
            double itog = sumka + percent;
            System.out.println("Сумма равна " + sumka + ", начисленный процент " + percent + ", итоговая сумма " + itog);
        } else {
            double percent = Math.round(sumka * 0.1);
            double itog = sumka + percent;
            System.out.println("Сумма равна " + sumka + ", начисленный процент " + percent + ", итоговая сумма " + itog);
        }
        System.out.println("\nОпределение оценки по предметам");
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
        double srednee = (progBall + historyBall) / 2;
        double sredneePersent = (programmingPercent + historyPercent) / 2;
        System.out.println(historyBall + " история\n" + progBall + " программирование");
        System.out.println("СРедний балл равен " + srednee + "\nсредний процент равен " + sredneePersent);

        System.out.println("\nРасчет прибыли за год");
        int arenda = 5000;
        int sale = 13000;
        int sebes = 9000;
        int pribil = (sale - sebes - arenda) * 12;
        if (pribil >= 0) {
            System.out.println("прибыль за год: +" + pribil + " руб.");
        } else {
            System.out.println("прибыль за год: " + pribil + " руб.");
        }
        System.out.println("\nПодсчет количества банкнот");
        int money = 567;
        int doll_100 = 10;
        int doll_10 = 10;
        int doll_1 = 50;
        int temp = money;
        int money100 = 0, money10 = 0, money1 = 0;
        int itogBankomat = doll_1 + doll_10 * 10 + doll_100 * 100;
        if (itogBankomat >= money) {
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
