package homeworks.homework_23;

public class Main {
    public static void main(String[] args) {
        TV TV1 = new TV("Philips", "P32LTD", 32, "LCD", true);

        TV1.info();
        System.out.println("==========\n");
        TV1.onOff();
        TV1.setVolumeUp();
        TV1.setChannelNext();
        TV1.info();
        System.out.println("==========\n");

        TV1.setChanne(55);
        TV1.setVolumeDown();
        TV1.setVolumeDown();
        TV1.setVolumeDown();
        TV1.setVolumeDown();
        TV1.info();
        System.out.println("==========\n");

        TV1.setChanne(99);
        TV1.setChannelNext();
        TV1.info();
        System.out.println("======================\n");

        EBook book1 = new EBook("Война и мир. Часть 1", "Лев Толстой", 1873, 960);
        book1.info();
        System.out.println("==========\n");

        book1.editName("Война и мир. Том 2");
        book1.info();
        System.out.println("==========\n");
    }
}