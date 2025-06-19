package lesson_44;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(17, "orange");
        map.put(7, "red");

        System.out.println(map);

        Collection<String> values = map.values(); // return all map´s values
        System.out.println("map.values(): " + values);

        // Set<K> keySet()
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);

        // for (Integer key : keys) {
        //     System.out.println(map.get(key) + ", ");
        // }
        // System.out.println();

        /*
        FOCUS!
         */

        keys.remove(17); // remove key from keys
        System.out.println("keys: " + keys);
        System.out.println("map: " + map); // no key 17
        System.out.println("values: " + values); // no value of key 17

        System.out.println("===============\n");
        values.remove("green");
        System.out.println("values: " + values);
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);

        System.out.println("===============\n");
        System.out.println(map.remove(16));
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("===============\n");
        //
        Set<Integer> keysCopy = new HashSet<>(map.keySet());
        keysCopy.remove(0);
        System.out.println("keysCopy: " + keysCopy);
        System.out.println("map: " + map);

        System.out.println("========Map.Entry========\n");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry: " + entry);
            System.out.println("entry.getKey(): " + entry.getKey());
            System.out.println("entry.getValue(): " + entry.getValue());
            System.out.println("===============\n");
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(15)) {
                entry.setValue("JAVA!");
            }
        }

        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);
        System.out.println("===============\n");

        // forEach()
        map.forEach((k, v) -> System.out.println("key: " + k + " -> value: " + v));

        map.forEach((key, val) -> {
            System.out.println("Iteration: ");
            System.out.println(key + " | " + val);
            System.out.println("===============\n");
        });
    }
}
