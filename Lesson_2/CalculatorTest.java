import java.util.Scanner;

public class CalculatorTest {
    static int a, b;
    static char sign;

    public static void iniz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите знак математической операции: ");
        sign = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            iniz();
            Calculator.equal(a, sign, b);
            System.out.print("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));

    }
}
