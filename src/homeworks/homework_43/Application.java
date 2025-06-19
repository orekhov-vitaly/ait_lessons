package homeworks.homework_43;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        /*
        Task 1
        Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

        Если строки имеют одинаковую длину - сортировать в естественном порядке
         */
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));


        /*
        Task 2
        Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами. Некоторые слова должны повторяться в обоих множествах.

        Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).

        Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).

        Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).

        Результат каждого метода необходимо выводить в консоль для наглядности.
        Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций.
         */
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(SetUtils.union(set1, set2));
        System.out.println(SetUtils.intersection(set1, set2));
        System.out.println(SetUtils.difference(set1, set2));


        /*
        Task 3
        Опционально
        Написать метод, возвращающий первый неповторяющийся символ в строке
         */
//        String string = "abcdefj ab,cdf,";
//        System.out.println(StrUtil.getFirstUniqueChar(string));
    }
}
