import java.util.Scanner;

public class CalculatorTest {

    public static void startCalculate() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите знак математической операции: ");
        char sign = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        calculator.calculate(a, sign, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            startCalculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));

    }
}
