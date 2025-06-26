package lesson_49;

import java.io.*;
import java.util.Arrays;

public class FileIOExample {
    public static void main(String[] args) throws InterruptedException {
        File pathDir = new File("files");
        File pathDir2 = new File("files/db/v1");

        // boolean mkdir() - directory create (only endet)
        System.out.println(pathDir.mkdir());
        System.out.println(pathDir2.mkdir());

        // boolean mkdirs() - directories create
        pathDir = new File("src/lesson_49/fileIO/files/example");
        System.out.println(pathDir.mkdirs());

        // new File(File/String parent, String child)
        File lessonDir = new File("src/lesson_49/fileIO");
        File pathDb = new File(lessonDir, "db/v01");
        System.out.println("path.mkdirs: " + pathDb.mkdirs());

        // delete()
        System.out.println("pathDir.delete(): " + pathDir.delete());

        // deleteOnExit()
        pathDb.deleteOnExit();

        // pause
        Thread.sleep(20);

        System.out.println("Application complete");

        System.out.println("===============\n");

        File file = new File(lessonDir, "text.txt");

        // boolean createNewFile()
        try {
            System.out.println("Create file: " + file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // boolean exists() - check exists file or directory
        System.out.println("file.exists(): " + file.exists());
        System.out.println("pathDir.exists(): " + pathDir.exists() + " | pathDb.exists(): " + pathDb.exists());

        // boolean isFile, isDirectory
        System.out.println("file.isFile(): " + file.isFile());
        System.out.println("file.isDirectory(): " + file.isDirectory());
        System.out.println("lessonDir.isFile(): " + lessonDir.isFile());
        System.out.println("lessonDir.isDirectory(): " + lessonDir.isDirectory());

        System.out.println("length(): " + file.length()); // file size
        System.out.println("lastModified(): " + file.lastModified());

        System.out.println("getName(): " + file.getName());
        System.out.println("getPath(): " + file.getPath());

        System.out.println("===============\n");

        try {
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write("Hello, world!");
            // fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            System.out.println("line: " + line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // String[] list()
        String[] names = lessonDir.list();
        System.out.println("Names: " + Arrays.toString(names));

        // Files[] listFiles()
        File[] files = lessonDir.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName() + " | " + file1.getPath() + " | " + file1.isFile());
        }
    }
}
