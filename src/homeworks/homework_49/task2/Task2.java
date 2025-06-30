package homeworks.homework_49.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task2 {
    private static final int LIMIT = 2000;
    private static final File PATH = new File("src/homeworks/homework_49/task2");
    private static final String FILE_DATA = "data";
    private static final String FILE_LESS = "less.txt";
    private static final String FILE_MORE = "more.txt";

    public static void main(String[] args) {
        List<String> records = readData();
        System.out.println(records);

        Map<String, Integer> userMap = listMap(records);
        System.out.println(userMap);

        writeFiles(userMap);
    }

    private static void writeFiles(Map<String, Integer> users) {
        try (BufferedWriter less = new BufferedWriter(new FileWriter(new File(PATH, FILE_LESS)));
             BufferedWriter more = new BufferedWriter(new FileWriter(new File(PATH, FILE_MORE)))) {
            for (Map.Entry<String, Integer> entry : users.entrySet()) {
                String dataToWrite = entry.getKey() + ":" + entry.getValue();
//                if (entry.getValue() < LIMIT) {
//                    less.write(dataToWrite);
//                    less.newLine();
//                } else {
//                    more.write(dataToWrite);
//                    more.newLine();
//                }

                BufferedWriter writer = entry.getValue() < LIMIT ? less : more;
                writer.write(dataToWrite);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, Integer> listMap(List<String> records) {
        return null;
    }

    private static List<String> readData() {
        List<String> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(PATH, FILE_DATA)))) {
            String line;
            while ((line = reader.readLine()) != null) {

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
