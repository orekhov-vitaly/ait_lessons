package homeworks.homework_26;

public class MathUtil {
    public static int sumInt(int...integers) {
        if(integers == null || integers.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }

        return sum;
    }

    public static int subInt(int...integers) {
        if(integers == null || integers.length == 0) return 0;
        int sub = 0;
        for (int i = 0; i < integers.length; i++) {
            if(i == 0) sub = integers[0];
            else sub -= integers[i];
        }

        return sub;
    }

    public static int multInt(int...integers) {
        if(integers == null || integers.length == 0) return 0;
        int mult = 1;
        for (int i = 0; i < integers.length; i++) {
            mult *= integers[i];
        }

        return mult;
    }

    public static double divInt(int...integers) {
        if(integers == null || integers.length == 0) return 0;
        double div = 0.0;
        for (int i = 0; i < integers.length; i++) {
            if(i == 0) div = integers[0];
            else div /= integers[i];
        }

        return div;
    }

    public static double powInt(double num, int pow) {
        double result = num;
        if(pow == 0) {
            return 1;
        } else if(pow > 0) {
            for (int i = 1; i < pow; i++) {
                result *= num;
            }
        } else {
            for (int i = 1; i > pow; i--) {
                result *= num;
            }
            result = 1/result;
        }

        return result;
    }
}
