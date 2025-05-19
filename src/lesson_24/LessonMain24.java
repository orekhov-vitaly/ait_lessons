package lesson_24;

public class LessonMain24 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        MagicArray magicArray = new MagicArray();

        magicArray.add(10);
        magicArray.add(20);
        magicArray.add(30, 40, 50);
        magicArray.add(60, 70, 80, 90, 100, 200);

        System.out.println(magicArray.size());
        System.out.println(magicArray.toString());

        System.out.println("magicArray(0): " + magicArray.get(0));
        System.out.println("===============\n");
        System.out.println(magicArray.remove(4));
        System.out.println(magicArray.toString());
        System.out.println(magicArray.remove(0));
        System.out.println(magicArray.toString());
        System.out.println(magicArray.size());
        System.out.println(magicArray.remove(8));
        System.out.println(magicArray.toString());
        System.out.println("===============\n");
        System.out.println(magicArray.indexOf(40));
        System.out.println(magicArray.lastIndexOf(90));
    }
}
