package homeworks.homework_31.game;

import java.util.Random;

public class Warrior extends GameCharacter{
    Random random = new Random();

    @Override
    public void attack() {
        int damage = random.nextInt(20) + 80;
        System.out.printf("Воин атакует мечом %d\n", damage);
    }
}
