package lesson_49.cats;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatsWriterReader {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(
                List.of(
                        new Cat("Cat", 9, true),
                        new Cat("John", 16, true),
                        new Cat("Maria", 8, false),
                        new Cat("Boris", 2, true),
                        new Cat("Hanna", 6, false),
                        new Cat("Catty", 5, false),
                        new Cat("Max", 3, true)
                )
        );

        // Write cats list
        // read cats list

        File path = new File("src/lesson_49/cats/files");
        path.mkdirs();
        File file = new File(path, "cats.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        writeCatsToFile(cats,file);

        List<Cat> readCats = readCatsFromFile(file);

        readCats.forEach(System.out::println);
    }

    private static List<Cat> readCatsFromFile(File file) {
        List<Cat> cats = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                //name|age|isMale
                Cat cat = parseCatFromstringLine(line);
                cats.add(cat);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cats;
    }

    private static Cat parseCatFromstringLine(String line) {
        // System.out.println(line);
        String[] split = line.split("\\|");
        // System.out.println(Arrays.toString(split));

        Cat cat = new Cat(split[0], Integer.parseInt(split[1]), Boolean.valueOf(split[2]));
        return cat;
    }

    private static void writeCatsToFile(List<Cat> cats, File file){
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Cat cat : cats) {
            try (FileWriter fileWriter = new FileWriter(file, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                //name|Age|isMale
                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Writing in file complete");
    }
}
