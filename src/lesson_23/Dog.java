package lesson_23;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void info() {
        System.out.println("I am dog " + name + ", my weight: " + weight);
    }

    public void eat() {
        System.out.println("Я кушаю, ням-ням!");
        this.weight++; // Увеличиваем вес на 1
    }

    public void run() {

        while(this.weight < 3) {
            System.out.println("я слишком худая(");
            System.out.println("Надо поесть. Мой вес сейчас: " + this.weight);

            eat();
        }

        System.out.println("Я бегу!");
        weight -= 2;  // Уменьшаем вес на 2
        System.out.println("Вес после пробежки: " + weight);
        System.out.println("=======");
    }
}
