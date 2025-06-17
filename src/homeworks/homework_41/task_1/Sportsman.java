package homeworks.homework_41.task_1;

public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score=" + score +
                '}';
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Sportsman s) {
        String s1 = this.getName();
        String s2 = s.getName();
        if (s1.compareTo(s2) != 0) {
            return s1.compareTo(s2);
        }
        return this.getAge() - s.getAge();
    }
}
