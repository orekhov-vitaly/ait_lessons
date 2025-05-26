package homeworks.homework_28.game_objects.items;

import homeworks.homework_28.game_objects.Item;

public class Armor extends Item {
    private int defense;

    public Armor(String name, int weight, String slot, int defense) {
        super(name, weight, slot);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String toString() {
        return "Name: " + super.getName() + "\nWeight: " + super.getWeight() +
                "\nSlot: " + super.getSlot() + "\nDefense: " + this.getDefense();
    }
}
