package homeworks.homework_30.sport;

public class AmateurAthlete extends Human{
    public AmateurAthlete(String name) {
        super(name);
        this.athleteLevel = "Amatuer";
        this.speed = 15;
        this.restTime = 10;
    }
}
