package homeworks.homework_28;

import homeworks.homework_28.game_objects.characters.NPC;
import homeworks.homework_28.game_objects.characters.Player;
import homeworks.homework_28.game_objects.items.Armor;
import homeworks.homework_28.game_objects.items.Weapon;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle("Rectangle", "Red", 20, 10);
        rect1.setDimensions(30, 50);
        rect1.displayInfo();
        rect1.calculateArea();
        System.out.println("==============\n");

        Circle circle1 = new Circle("Circle", "White", 2);
        circle1.setRadius(3);
        circle1.displayInfo();
        circle1.calculateArea();
        System.out.println("==============\n");

        Player player = new Player("Player", 100, 10, 10);
        System.out.println(player.toString());
        player.move();
        player.attack();
        System.out.println("==============\n");

        NPC wolf = new NPC("Wolf", 50, 5, 15, true);
        System.out.println(wolf.toString());
        wolf.move();
        wolf.attack();
        System.out.println("==============\n");

        Weapon sword = new Weapon("Ekskalibur", 20, "Right hand", 150, 20);
        System.out.println(sword.toString());
        System.out.println("==============\n");

        Armor helmet = new Armor("Good helmet", 5, "Head", 15);
        System.out.println(helmet.toString());
        System.out.println("==============\n");

    }
}
