package homeworks.homework_35;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyList<T> и MyList<U>, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
Пример использования:

MyList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");

MyList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);
 */

import lists.MyArrayList;
import lists.MyList;

public class PrintTowLists {
    public static <T,U> void printTwoLists(MyList<T> list1, MyList<U> list2) {
        for (T element : list1) {
            System.out.println(element);
        }

        for (U element : list2) {
            System.out.println(element);
        }
    }
}
