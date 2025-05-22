package lesson_26.init_blocks;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {
//        System.out.println("static counter: " + StaticBlockDemo.counter);
        System.out.println("static colors: " + Arrays.toString(StaticBlockDemo.colors));
//
        StaticBlockDemo demo = new StaticBlockDemo();
        System.out.println("==========\n");
        StaticBlockDemo demo2 = new StaticBlockDemo();
        System.out.println("==========\n");
        StaticBlockDemo demo3 = new StaticBlockDemo(50);
        System.out.println("==========\n");

        System.out.println(demo.getCapacity());
    }
}
