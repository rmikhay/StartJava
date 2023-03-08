public class Calculator {
    public int pow(int base, int power) {
        int resultPow = 1;
        for (int i = 0; i < power; i ++) {
            resultPow *= base;
        }
        return resultPow;
    }

    public void calculator(int a, char sign, int b) {
        int result = 0;
        double resultDiv = 0;
        switch (sign) {
            case '+': {
                result = a + b;
                break;
            }
            case '-': {
                result = a - b;
                break;
            }
            case '*': {
                result = a * b;
                break;
            }
            case '/': {
                resultDiv = (double) a / (double) b;
                break;
            }
            case '^': {
                result = pow(a, b);
                break;
            }
            case '%': {
                result = a % b;
                break;
            }
        }
        if (sign == '/') {
            System.out.printf("%d %c %d = %5.2f\n", a, sign, b, resultDiv);
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}
