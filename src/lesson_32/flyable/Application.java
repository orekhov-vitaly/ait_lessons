package lesson_32.flyable;

public class Application {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Boat boat = new Boat();
        Duck duck = new Duck();

        airplane.fly();
        boat.swim();
        duck.fly();
        duck.swim();

        System.out.println("==========");

        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();

            // Проверим возможность приведения ссылки к типу интрфейса
            if (flyable instanceof Swimmable) {
                System.out.println("Этот объект можно привести к Swimmable: " + flyable.getClass().getSimpleName());
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swim();
                System.out.println("===========");
            } else {
                System.out.println("НЕ могу привести к swimmable: " + flyable.getClass().getSimpleName());
            }
            System.out.println("===========");

            if (flyable instanceof Airplane) {
                System.out.println("можно привести к классу Airplane: " + flyable.getClass().getSimpleName());
                Airplane airplane1Link = (Airplane) flyable;
                airplane1Link.takePassenger();
                System.out.println("===========");
            }
        }
    }
}
