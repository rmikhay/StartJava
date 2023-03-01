public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        boolean isVideocardAvailable = true;
        byte volumeVideo = 6;
        short corseOfCpu = 8;
        int ramFrequency = 2333;
        long diagonalMonitor = 25;
        char indexCpu = 'K';
        float ramCount = 2;
        double cpuFrequencyMhz = 3.8;
        System.out.println("Наличие видеокарты - " + isVideocardAvailable + ", объем - " + volumeVideo + "GB");
        System.out.println("Ядер процессора - " + corseOfCpu + ", индекс - " + indexCpu + ", частота - " +
                cpuFrequencyMhz + "МГц");
        System.out.println("Оперативная память - " + ramFrequency + "Гц, планок - " + ramCount);
        System.out.println("Монитор- " + diagonalMonitor + "дюйм \n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int fullPrice = penPrice + bookPrice;
        double discountSum = (fullPrice * discount) / 100;
        double discountPrice = fullPrice - discountSum;

        System.out.println("Цена без скидки " + fullPrice + " руб.");
        System.out.println("Скидка " + discountSum + " руб.");
        System.out.println("Цена со скидкой " + discountPrice + " руб. \n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a \n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        short s = Short.MAX_VALUE;
        System.out.println(s + "\n" + ++s + "\n" + --s);
        int i = Integer.MAX_VALUE;
        System.out.println(i + "\n" + ++i + "\n" + --i);
        byte b = Byte.MAX_VALUE;
        System.out.println(b + "\n" + ++b + "\n" + --b);
        long l = Long.MAX_VALUE;
        System.out.println(l + "\n" + ++l + "\n" + --l);

        System.out.println("\n5. Перестановка значений переменных");
        int x = 2;
        int y = 5;
        System.out.println("с помощью третьей переменной, исходные числа - " + x + " и " + y);
        int t = x;
        x = y;
        y = t;
        System.out.println("Получилось " + x + " и " + y);
        System.out.println("с помощью арифметических операций, исходные числа - " + x + " и " + y);
        x += y;
        y = x - y;
        x -= y;
        System.out.println("Получилось " + x + " и " + y);
        System.out.println("с помощью побитовой операции - " + x + " и " + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("Получилось " + x + " и " + y);

        System.out.println("\n6. Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) hash + " " + hash);
        System.out.println((int) ampersand + " " + ampersand);
        System.out.println((int) at + " " + at);
        System.out.println((int) caret + " " + caret);
        System.out.println((int) underscore + " " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + openParenthesis + " " + closeParenthesis + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int sum = hundreds + tens + ones;
        int productDigits = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит\n" + hundreds + " сотен\n" + tens +
                " десятков\n" + ones + " единиц");
        System.out.println("Сумма его цифр = " + sum + "\nПроизведение = " + productDigits);

        System.out.println("\n9. Вывод времени");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = sec % 3600 / 60;
        sec %= 60;
        System.out.println(hours + ":" + minutes + ":" + sec);
    }
}
