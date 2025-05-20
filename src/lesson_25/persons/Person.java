package lesson_25.persons;

public class Person {
    private String name;
    private int age;
    private String hobby;

    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String toString() {
        // Формирование строкового формирования объекта
        return String.format("Person %s, age: %d, hobby: %s", name, age, hobby);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
