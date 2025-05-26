package homeworks.homework_28.game_objects;

public class Character extends GameObject {
    private int health;
    private int power;
    private int speed;

    public Character(String name, int health, int power, int speed) {
        super(name);
        this.health = health;
        this.power = power;
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void stand() {
        System.out.println(super.getName() + " стоит");
    }

    public void move() {
        System.out.println(super.getName() + " бежит со скорость " + this.speed);
    }

    public void attack() {
        System.out.println(super.getName() + " бъет с силой " + this.power);
    }

    public void speak() {
        System.out.println(super.getName() + " говорит");
    }
}
