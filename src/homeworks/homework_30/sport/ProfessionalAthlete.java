package homeworks.homework_30.sport;

public class ProfessionalAthlete extends Human{
    public ProfessionalAthlete(String name) {
        super(name);
        this.athleteLevel = "Professional";
        this.speed = 25;
        this.restTime = 5;
    }
}
