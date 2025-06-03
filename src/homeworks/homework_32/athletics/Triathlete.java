package homeworks.homework_32.athletics;

public class Triathlete implements Swimmer, Runner{
    @Override
    public void run() {
        System.out.println("Триалонист бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Триатлонист плывет!");
    }
}
