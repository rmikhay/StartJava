import java.util.Scanner;

public class CalculatorTest {
    int a, b;
    char sign;

    public void initialisation() {
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
        CalculatorTest calculatorTest = new CalculatorTest();
        Calculator calculator = new Calculator();
        do {
            calculatorTest.initialisation();
            calculator.calculator(calculatorTest.a, calculatorTest.sign, calculatorTest.b);
            do {
            System.out.print("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
            } while (!(answer.equals("yes") || answer.equals("no")));
        } while (!answer.equals("no"));

    }
}
