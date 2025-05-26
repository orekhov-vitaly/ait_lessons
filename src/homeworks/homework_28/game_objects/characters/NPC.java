package homeworks.homework_28.game_objects.characters;

import homeworks.homework_28.game_objects.Character;

public class NPC extends Character {
    private boolean enemy;
    public NPC(String name, int health, int power, int speed, boolean enemy) {
        super(name, health, power, speed);
        this.enemy = enemy;
    }

    public boolean isEnemy() {
        return enemy;
    }

    public void setEnemy(boolean enemy) {
        this.enemy = enemy;
    }

    public String toString() {
        return "Name: " + super.getName() + "\nHealth: " + super.getHealth() + "\nPower: " + super.getPower() +
                "\nSpeed: " + this.getSpeed() + "\nEnemy: " + this.isEnemy();
    }
}
