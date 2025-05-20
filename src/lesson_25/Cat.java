package lesson_25;

public class Cat {
    protected String name;
    private int age;
    public int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Акссесоры
    // Геттеры и сеттеры - специальные открытые методы
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if(age < 0 || age > 20) {
            return;
        }
        this.age = age;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) return;
        this.name = name;
    }

    void info() {
        System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
    }

    void sayMeow() {
        System.out.println("Meow! " + name);
    }
}
