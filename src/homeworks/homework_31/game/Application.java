package homeworks.homework_31.game;

public class Application {
    public static void main(String[] args) {
        GameCharacter warrior1 = new Warrior();
        GameCharacter mage1 = new Mage();
        GameCharacter archer1 = new Archer();

        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = warrior1;
        characters[1] = mage1;
        characters[2] = archer1;

        for (int i = 0; i < characters.length; i++) {
            characters[i].attack();
            characters[i].attack();
            characters[i].attack();
        }
    }
}
