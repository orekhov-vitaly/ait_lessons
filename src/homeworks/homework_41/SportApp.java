package homeworks.homework_41;

import java.util.Arrays;

public class SportApp {
    public static void main(String[] args) {
        Sportsman[] sportsmans = new Sportsman[6];

        sportsmans[0] = new Sportsman("Vitalii", 37, 42);
        sportsmans[1] = new Sportsman("John", 25, 52);
        sportsmans[2] = new Sportsman("Mark", 28, 35);
        sportsmans[3] = new Sportsman("Vitalii", 22, 75);
        sportsmans[4] = new Sportsman("Dmitry", 45, 41);
        sportsmans[5] = new Sportsman("Dmitry", 27, 89);

        printString(sportsmans);

        Arrays.sort(sportsmans);
        printString(sportsmans);

        Arrays.sort(sportsmans, new SportsmanScorComparator());
        printString(sportsmans);

        Arrays.sort(sportsmans, (s1, s2) -> s1.getAge() - s2.getAge());
        printString(sportsmans);
    }

    public static void printString(Sportsman[] sportsmans) {
        System.out.println("==========");
        for (Sportsman s : sportsmans) {
            System.out.println(s);
        }
        System.out.println("==========");
    }
}
