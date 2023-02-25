public class calculator {

    public static void main(String[] args) {
        char sign = '^';
        int a = 5;
        int b  =6;
        int result;
        if (sign == '+') {
            result = a + b;
            System.out.println(a + " " + sign + " " + b + "  = " + result);
        }
        if (sign == '-') {
            result = a - b;
            System.out.println(a + " " + sign + " " + b + "  = " + result);
        }
        if (sign == '*') {
            result = a * b;
            System.out.println(a + " " + sign + " " + b + "  = " + result);
        }
        if (sign == '/') {
            double result_div = (double)a / (double) b;
            System.out.println(a + " " + sign + " " + b + "  = " + result_div);
        }
        if (sign == '^') {
            result = pow(a, b);
            System.out.println(a + " " + sign + " " + b + "  = " + result);
        }
        if (sign == '%') {
            result = a % b;
            System.out.println(a + " " + sign + " " + b + "  = " + result);
        }
    }

    public static int pow(int multiply, int pow) {
        int answer = 1;
        for (int i = 0; i < pow; i ++) {
            answer *= multiply;
        }
        return answer;
    }
}
