package lesson_32.interfaces;

public class Presentation implements ColorPrintable{
    String title;
    String author;
    String theme;

    public Presentation(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }

    @Override
    public void colorPrint() {
        System.out.println("Печать презентации в цвете");

    }

    @Override
    public void print() {
        System.out.printf("Печать ЧБ презентации %s автора %s\n", theme, author);
    }
}
