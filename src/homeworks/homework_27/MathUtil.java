package homeworks.homework_27;

public class MathUtil {
    private static final double PI = 3.141519;
    public static double sumNum(double...integers) {
        if(integers == null || integers.length == 0) return 0;
        double sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }

        return sum;
    }

    public static double subNum(double...integers) {
        if(integers == null || integers.length == 0) return 0;
        double sub = 0;
        for (int i = 0; i < integers.length; i++) {
            if(i == 0) sub = integers[0];
            else sub -= integers[i];
        }

        return sub;
    }

    public static double multNum(double...integers) {
        if(integers == null || integers.length == 0) return 0;
        double mult = 1;
        for (int i = 0; i < integers.length; i++) {
            mult *= integers[i];
        }

        return mult;
    }

    public static double divNum(double...integers) {
        if(integers == null || integers.length == 0) return 0;
        double div = 0.0;
        for (int i = 0; i < integers.length; i++) {
            if(i == 0) div = integers[0];
            else div /= integers[i];
        }

        return div;
    }

    public static double powNum(double num, int pow) {
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

    public static double circumference(double radius) {
        double result = 0;
        if(radius > 0) {
            result = 2 * PI * radius;
        }
        return result;
    }

    public static double circleRadius(double radius) {
        double result = 0;
        if(radius > 0) {
            result = PI * powNum(radius, 2);
        }
        return result;
    }
}
