package lesson_49.fileIO;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        Выберите или создайте какую-то папку.
        Создайте в папке 10 файлов: test_1.txt, test_2.txt ... test_10.txt.
        В каждый файл запишите соответсвующую строку: Java1m Java2 ... Java10
         */
        File pathTask1 = new File("src/lesson_49/fileIO/task1");
        System.out.println("pathTask1.mkdirs: " + pathTask1.mkdirs());

        for (int i = 1; i < 11; i++) {
            File file = new File(pathTask1, "test_" + i + ".txt");
            try {
                System.out.println("Create file: " + file.createNewFile());
                FileWriter fileWriter = new FileWriter(file, false);
                fileWriter.write("Java" + i);
                // fileWriter.write("\n");
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        Проверьте все файлы в директории (получите список файлов, залезть в каждый, считать строку)
        Выведите в консоль имя файла, в котором содержится строка "Java7"
        // Output: test_7.txt
         */

        System.out.println("==========");

        File[] files = pathTask1.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                try (FileReader fileReader = new FileReader(file);
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    String line = bufferedReader.readLine();
                    if (line != null && line.equals("Java7")) {
                        System.out.println(file.getName());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
