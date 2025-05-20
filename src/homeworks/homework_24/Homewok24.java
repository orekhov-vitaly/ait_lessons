package homeworks.homework_24;

public class Homewok24 {
    public static void main(String[] args) {
        MagicArrayHomework24 array1 = new MagicArrayHomework24();

        array1.add(1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1);
        System.out.println(array1.size());
        System.out.println(array1.toString());

        array1.add(100);
        System.out.println(array1.size());
        System.out.println(array1.toString());

        array1.get(7);
        System.out.println(array1.size());
        System.out.println(array1.toString());

        array1.indexOf(8);
        System.out.println(array1.size());
        System.out.println(array1.toString());

        array1.lastIndexOf(8);
        System.out.println(array1.size());
        System.out.println(array1.toString());

        System.out.println(array1.removeByValue(9));
        System.out.println(array1.size());
        System.out.println(array1.toString());

        System.out.println(array1.removeByValue(1));
        System.out.println(array1.size());
        System.out.println(array1.toString());

        int[] ints = {10, 20, 30, 40, 50};

        MagicArrayHomework24 magicArray = new MagicArrayHomework24();
    }
}
