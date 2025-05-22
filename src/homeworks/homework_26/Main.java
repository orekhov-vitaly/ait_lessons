package homeworks.homework_26;

public class Main {
    public static void main(String[] args) {
        int sum = MathUtil.sumInt(5);
        System.out.println("Summ: " + sum);

        sum = MathUtil.sumInt(5, 7, 0);
        System.out.println("Summ: " + sum);

        sum = MathUtil.sumInt(null);
        System.out.println("Summ: " + sum);

        System.out.println("===========\n");

        int sub = MathUtil.subInt(12, 7);
        System.out.println("Sub: " + sub);

        sub = MathUtil.subInt(12, 7, -7, 5, 10);
        System.out.println("Sub: " + sub);

        sub = MathUtil.subInt(null);
        System.out.println("Sub: " + sub);

        System.out.println("===========\n");

        int mult = MathUtil.multInt(12, 7);
        System.out.println("Mult: " + mult);

        mult = MathUtil.multInt(12, 7, -7, 5, 10);
        System.out.println("Mult: " + mult);

        mult = MathUtil.multInt(null);
        System.out.println("Mult: " + mult);

        System.out.println("===========\n");

        double div = MathUtil.divInt(3, 2);
        System.out.println("Division: " + div);

        div = MathUtil.divInt(3, 2, -1);
        System.out.println("Division: " + div);

        div = MathUtil.divInt(null);
        System.out.println("Division: " + div);

        System.out.println("===========\n");

        double pow = MathUtil.powInt(3,2);
        System.out.println("Pow: " + pow);

        pow = MathUtil.powInt(-2,-3);
        System.out.println("Pow: " + pow);

        pow = MathUtil.powInt(2.25, 4);
        System.out.println("Pow: " + pow);

        System.out.println("===========\n");

        Dog dog1 = new Dog("Max", 20);
        dog1.info();
        int result = dog1.jumpBarrier(50);
        System.out.println("Барьер высотой 50 см");
        if(result == 1) {
            System.out.println("Собака взяла барьер!");
        } else if(result == 0) {
            System.out.println("Собака не взяла барьер. Надо ещё тренероваться");
            dog1.train();
        } else {
            System.out.println("Этот барьер недостежимдля этой собаки.");
        }
        System.out.println("===========");
        System.out.println("===========");
        Dog dog2 = new Dog("Jack", 50);
        dog2.info();
        result = dog2.jumpBarrier(50);
        System.out.println("Барьер высотой 50 см");
        if(result == 1) {
            System.out.println("Собака взяла барьер!");
        } else if(result == 0) {
            System.out.println("Собака не взяла барьер. Надо ещё тренероваться");
            dog2.train();
        } else {
            System.out.println("Этот барьер недостежимдля этой собаки.");
        }
        System.out.println("===========");
        dog2.info();
        result = dog2.jumpBarrier(60);
        System.out.println("Барьер высотой 60 см");
        if(result == 1) {
            System.out.println("Собака взяла барьер!");
        } else if(result == 0) {
            System.out.println("Собака не взяла барьер. Надо ещё тренероваться");
            dog2.train();
        } else {
            System.out.println("Этот барьер недостежимдля этой собаки.");
        }
        System.out.println("===========");
        dog2.info();
        result = dog2.jumpBarrier(60);
        System.out.println("Барьер высотой 60 см");
        if(result == 1) {
            System.out.println("Собака взяла барьер!");
        } else if(result == 0) {
            System.out.println("Собака не взяла барьер. Надо ещё тренероваться");
            dog2.train();
        } else {
            System.out.println("Этот барьер недостежимдля этой собаки.");
        }
        System.out.println("===========");

    }
}
