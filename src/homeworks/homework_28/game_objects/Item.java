package homeworks.homework_28.game_objects;

public class Item extends GameObject {
    private int weight;
    private String slot;

    public Item(String name, int weight, String slot) {
        super(name);
        this.weight = weight;
        this.slot = slot;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
