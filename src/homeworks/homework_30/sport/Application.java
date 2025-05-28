package homeworks.homework_30.sport;

public class Application {
    public static void main(String[] args) {
        Human man1 = new Human("Alex");
        AmateurAthlete man2 = new AmateurAthlete("John");
        ProfessionalAthlete man3 = new ProfessionalAthlete("Nick");

        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(man3.toString());
        System.out.println("==========");

        man1.run();
        man1.run();
        System.out.println("==========");
        man2.run();
        man2.run();
        System.out.println("==========");
        man3.run();
        man3.run();
        System.out.println("==========");
    }
}
