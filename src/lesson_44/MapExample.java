package lesson_44;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> oldTable = new Hashtable<>(); // Not recommend

        Map<String, String> phoneBook = new HashMap<>();

        // Add key-value
        // V put(K key, V value) ->
        System.out.println(phoneBook.put("Hanna", "+49-11111"));
        System.out.println("phoneBook: " + phoneBook + "\n");

        System.out.println(phoneBook.put("Hanna", "+49-11111-11"));
        System.out.println("phoneBook: " + phoneBook + "\n");

        System.out.println(phoneBook.put("Max", "+49-22222"));
        System.out.println(phoneBook.put("John", "+49-33333"));
        System.out.println("phoneBook: " + phoneBook + "\n");

        String oldValue = phoneBook.put("John", "+49-44444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook + "\n");

        Map<String, String> book2 = new HashMap<>();
        book2.put("Seb", "+49-55555");
        book2.put("Michael", "+49-66666");

        phoneBook.putAll(book2);

        System.out.println("Book2: " + book2);
        System.out.println("phoneBook: " + phoneBook + "\n");

        // boolean containsKey(Object key) - return true, if map has key
        // boolean containsValue(Object value) - return true, if map has value
        System.out.println(phoneBook.containsKey("Seb"));
        System.out.println("phoneBook.containsValue(\"Hello\"): " + phoneBook.containsValue("Hello"));
        System.out.println("phoneBook.containsValue(\"+49-11111-11\"): " + phoneBook.containsValue("+49-11111-11"));

        System.out.println("=============== GET ================");

        // V get(Object) - return value. If map has not key - return null
        String value = phoneBook.get("Hanna");
        System.out.println("value: " + value);
        System.out.println("phoneBook.get(\"KEY\"): " + phoneBook.get("KEY"));

        // getOrDefault(Object key, V defaultValue) - return value. If map has not key - return default
        String value2 = phoneBook.getOrDefault("Hanna", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"Hanna\"): " + value2);

        value2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"KEY\"): " + value2);


        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");

        // Constructor. 16 baskets
        Map<Integer, String> construct = new HashMap<>();
        construct = new HashMap<>(30); // 32 baskets. e=0.75
        construct = new HashMap<>(30, 0.90f); // 32 baskets. e=0.90

        //
        construct = new HashMap<>(otherMap);
        System.out.println("construct: " + construct);


        System.out.println("=============== REMOVE ================");

        // V remove(Object key)
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Michael")); // return value
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Nicolas")); // return null

        // boolean remove(Object key, Object value) - delete key-value, if map has key-value

        System.out.println(phoneBook.remove("Hanna", "+49-22222")); // map has not shis key-value
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Max", "+49-22222")); // map has not shis key-value
        System.out.println(phoneBook);

        // void clear()
        // int size()
        System.out.println(phoneBook.size());
        // boolean isEmpty() - return true, if map is empty
    }
}
