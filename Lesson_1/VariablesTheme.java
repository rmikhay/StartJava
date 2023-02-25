public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Вывод значений переменных на консоль");
        boolean videocard = true;
        byte volVideo = 6;
        short cpu = 8;
        int opera = 2333;
        long led = 25;
        char indexCpu = 'K';
        float operaNumber = 2;
        double CpuHerz = 3.8;
        System.out.println("Наличие видеокарты - " + videocard + ", объем - " + volVideo + "GB");
        System.out.println("Ядер процессора - " + cpu + ", индекс - " + indexCpu + ", частота - " + CpuHerz + "МГц");
        System.out.println("Оперативная память - " + opera + "Гц, планок - " + operaNumber);
        System.out.println("Монитор- " + led + "дюйм \n");

        System.out.println("Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int fullPrice = penPrice + bookPrice;
        double discountRuble = (fullPrice * discount) / 100;
        double priceWithDiscount = fullPrice - discountRuble;

        System.out.println("Цена без скидки " + fullPrice + " руб.");
        System.out.println("Скидка " + discountRuble + " руб.");
        System.out.println("Цена со скидкой " + priceWithDiscount + " руб. \n");

        System.out.println("Вывод слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a \n");

        System.out.println("Вывод min и max значений целых числовых типов");
        short s = Short.MAX_VALUE;
        System.out.println(s + "\n" + s++ + "\n" + s--);
        int i = Integer.MAX_VALUE;
        System.out.println(i + "\n" + i++ + "\n" + i--);
        byte b = Byte.MAX_VALUE;
        System.out.println(b + "\n" + b++ + "\n" + b--);
        long l = Long.MAX_VALUE;
        System.out.println(l + "\n" + l++ + "\n" + l--);

        System.out.println("\nПерестановка значений переменных");
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

        System.out.println(" \nВывод символов и их кодов");
        char k1 = '#';
        int k1_n = (int)k1;
        char k2 = '&';
        int k2_n = (int)k2;
        char k3 = '@';
        int k3_n = (int)k3;
        char k4 = '^';
        int k4_n = (int)k4;
        char k5 = '_';
        int k5_n = (int)k5;
        System.out.println(k1_n + " " + k1);
        System.out.println(k2_n + " " + k2);
        System.out.println(k3_n + " " + k3);
        System.out.println(k4_n + " " + k4);
        System.out.println(k5_n + " " + k5);

        System.out.println(" \nВывод в консоль ASCII-арт Дюка");
        char sy1 = '/';
        char sy2 = '\\';
        char sy3 = '_';
        char sy4 = '(';
        char sy5 = ')';
        System.out.println("     " + sy1 + sy2);
        System.out.println("    " + sy1 +"  " + sy2);
        System.out.println("   " + sy1 + sy3+sy4+" "+sy5 + sy2);
        System.out.println("  " + sy1 +"      " + sy2);
        System.out.println(" " + sy1 +sy3+sy3+sy3+sy1+sy2+sy3+sy3+" "+sy2);

        System.out.println(" \nВывод количества сотен, десятков и единиц числа");
        int n = 123;
        int n3 = n % 10;
        int n2 = n / 10;
        int n1 = n2 / 10;
        n2 %= 10;
        int sumka = n1 + n2 + n3;
        int multiply = n1 * n2 * n3;
        System.out.println("Число " + n + " содержит\n" + n1 + " сотен\n" + n2 + " десятков\n" + n3 + " единиц");
        System.out.println("Сумма его цифр = " + sumka + "\nПроизведение = " + multiply);

        System.out.println(" \nВывод времени");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec - (hours * 3600)) / 60;
        sec -= hours*3600 + minutes*60;
        System.out.println(hours + ":" + minutes + ":" +sec);
    }
}
