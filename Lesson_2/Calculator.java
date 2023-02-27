public class Calculator {
    public static int pow(int multiply, int power) {
        int answer = 1;
        for (int i = 0; i < power; i++) {
            answer *= multiply;
        }
        return answer;
    }

    public static void equal(int a, char sign, int b) {
        int result;
        switch (sign) {
            case '+': {
                result = a + b;
                System.out.println(a + " " + sign + " " + b + "  = " + result);
                break;
            }
            case '-': {
                result = a - b;
                System.out.println(a + " " + sign + " " + b + "  = " + result);
                break;
            }
            case '*': {
                result = a * b;
                System.out.println(a + " " + sign + " " + b + "  = " + result);
                break;
            }
            case '/': {
                double result_div = (double) a / (double) b;
                System.out.println(a + " " + sign + " " + b + "  = " + result_div);
                break;
            }
            case '^': {
                result = pow(a, b);
                System.out.println(a + " " + sign + " " + b + "  = " + result);
                break;
            }
            case '%': {
                result = a % b;
                System.out.println(a + " " + sign + " " + b + "  = " + result);
                break;
            }
        }
    }
}
