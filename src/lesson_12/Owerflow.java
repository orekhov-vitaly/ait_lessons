package lesson_12;

public class Owerflow {
    public static void main(String[] args) {
        byte byteVar = 127;
        System.out.println(byteVar);

        byteVar++;
        System.out.println(byteVar);

    }
}
