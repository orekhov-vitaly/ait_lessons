package homeworks.homework_28.game_objects.characters;

import homeworks.homework_28.game_objects.Character;

public class Player extends Character {
    public Player(String name, int health, int power, int speed) {
        super(name, health, power, speed);
    }

    public String toString() {
        return "Name: " + super.getName() + "\nHealth: " + super.getHealth() + "\nPower: " + super.getPower() +
                "\nSpeed: " + this.getSpeed();
    }
}
