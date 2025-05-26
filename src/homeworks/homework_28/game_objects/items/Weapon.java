package homeworks.homework_28.game_objects.items;

import homeworks.homework_28.game_objects.Item;

public class Weapon extends Item {
    private int damage;
    private int attackSpeed;

    public Weapon(String name, int weight, String slot, int damage, int attackSpeed) {
        super(name, weight, slot);
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public String toString() {
        return "Name: " + super.getName() + "\nWeight: " + super.getWeight() +
                "\nSlot: " + super.getSlot() + "\nDamage: " + this.getDamage() +
                "\nAttack speed: " + this.getAttackSpeed();
    }
}
