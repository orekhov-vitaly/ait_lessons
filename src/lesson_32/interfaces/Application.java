package lesson_32.interfaces;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "М. Булгаков");
        book.print();

        Journal journal = new Journal("Cosmopolitan", 154);
        journal.print();

        book.defaultMethod();
        journal.defaultMethod();

        Printable printable = journal;  // Неявное преобразование типа ссылки
        Printable printable1 = new Book("Философия Java", "Б. Эккель");

        printable1.print();

        Printable.testStaticMethod("Hello");

        ColorPrintable presentation = new Presentation("Inheriteance", "Noname", "Inheritance in OOP");

        presentation.colorPrint();
        presentation.defaultMethod();
        presentation.print();
        System.out.println(ColorPrintable.STATUS);
    }
}
