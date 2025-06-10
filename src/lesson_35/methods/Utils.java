package lesson_35.methods;

import lists.MyArrayList;
import lists.MyList;

public class Utils {
    public static void main(String[] args) {
        Integer[] integers = {0,1,2,3,4,5,6};
        printArray(integers);

        String[] strings = {"Hello", "world", "Java", "JS"};
        printArray(strings);

        swap(strings, 0, 2);
        printArray(strings);

        MyList<Double> doubleList = new MyArrayList<>(new Double[]{1.5,2.56,6.4343,443.6});

        Double firstValue = Utils.getFirstElement(doubleList);
        System.out.println(firstValue);

        MyList<String> stringsList = new MyArrayList<>();
        stringsList.addAll(strings);

        System.out.println("stringsList: " + stringsList);
        System.out.println(Utils.getFirstElement(stringsList));

        double sum = Utils.sumElements(1,3,5,1000, 11.1,3.7,3.14115);
        System.out.println("Sum: " + sum);

        int s = Utils.listSum(doubleList);
        System.out.println("Sum: " + s);

        MyList<Integer> integerList = new MyArrayList<>();
        integerList.addAll(integers);

        Utils.addNumbers(integerList);
        System.out.println("integerList: " + integerList);
    }

    public static <T> void printArray(T[] array) {
        if (array == null) return;
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n"));
        }
    }

    // Метод, который позволяет поменять местами два элемента массива с элементами любого ссылочного типа
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Метод, который возвращает первый элемент в списке
    public static <T> T getFirstElement(MyList<T> list) {
        if (list == null || list.isEmpty()) return null;
        return list.get(0);
    }

    // Написать метод, который будет принимать несколько чисел и возвращать их сумму
    /*
    Ограничение сверу (Upper Bound)
    Ограничиваем диапазон принимаемых типов данных
    <T extends SomeClass> - что T должен быть либо классом SomeClass, либо его потомком
    */
    public static <T extends Number> double sumElements(T... elements) {
        double sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].doubleValue();
        }

        return sum;
    }

    // Получить сумму всех элементов списка
    // ? - Wildcard - "Неизвестный тип"
    // ? extends Numbers - любой тип, являющийся наследником Number
    public static int listSum(MyList<? extends Number> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).intValue();
        }

        return sum;
    }

    // Ограничение снизу (Lower Bound)
    // ? super Integer - мы работаем с неизвестным типом, который является классом Integer или его родителем
    public static void addNumbers(MyList<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(5);
        }
    }
}
