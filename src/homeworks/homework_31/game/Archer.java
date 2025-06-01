package homeworks.homework_31.game;

import java.util.Random;

public class Archer extends GameCharacter{
    Random random = new Random();

    @Override
    public void attack() {
        int damage = random.nextInt(40) + 40;
        System.out.printf("Лучник атакует из арбалета %d\n", damage);
    }
}
