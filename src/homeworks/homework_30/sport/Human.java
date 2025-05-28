package homeworks.homework_30.sport;

public class Human {
    private String name;
    protected String athleteLevel;
    protected int speed;
    protected int restTime;
    private int requiredRestTime;

    public Human(String name) {
        this.name = name;
        this.athleteLevel = "Humen";
        this.speed = 10;
        this.restTime = 15;
        this.requiredRestTime = 0;
    }

    private void restCalculation() {
        this.requiredRestTime += this.restTime;
    }

    public void run() {
        System.out.println(this.name + " running.");
        restCalculation();
        System.out.println("Reuired rest time: " + this.requiredRestTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Array: {");
        sb.append("Name: ").append(this.name);
        sb.append("; Athlete level: '").append(this.athleteLevel).append("'");
        sb.append("; Running speed: ").append(this.speed);
        sb.append("; Rest time: ").append(this.restTime);
        sb.append("}");
        return sb.toString();
    }

    public int getSpeed() {
        return speed;
    }

    public int getRestTime() {
        return restTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
