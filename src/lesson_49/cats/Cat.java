package lesson_49.cats;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private boolean isMale;

    public Cat(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;
        return age == cat.age && isMale == cat.isMale && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + age;
        result = 31 * result + Boolean.hashCode(isMale);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
