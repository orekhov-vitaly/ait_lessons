package homeworks.homework_31.game;

import java.util.Random;

public class Mage extends GameCharacter{
    Random random = new Random();

    @Override
    public void attack() {
        int damage = random.nextInt(10) + 60;
        System.out.printf("Маг атакует огненным шаром %d\n", damage);
    }
}
