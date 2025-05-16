package lesson_20;

public class MethodsWithReturn {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(calculateSum(x, y));
        double pow = powTow(3);
        System.out.println(pow);
        System.out.println(powTow(0));
        System.out.println(powTow(-4));
    }

    public static double powTow(int x) {
        if (x == 0) {
            return 1;
        }

        boolean isPositive = x > 0;
        int result = 1;

        if (x < 0) x *= -1;
        for (int i = 0; i < x; i++) {
            result *= 2;
        }

        if (isPositive) return result;
        return 1.0 / result;
    }

    public static int calculateSum(int a, int b) {
        int result = a + b;
        return result;
    }
}
