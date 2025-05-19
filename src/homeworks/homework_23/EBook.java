package homeworks.homework_23;

public class EBook {
    String name;
    String author;
    int year;
    int pages;
    int currentPage;

    public EBook(String name, String author, int year, int pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.currentPage = 1;
    }

    public void editName(String name) {
        this.name = name;
    }

    public void editAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void info() {
        System.out.println(
            "Название: " + getName() +
            "\nАвтор: " + getAuthor() +
            "\nКоличество страниц: " + getPages() +
            "\nТекущая страница: " + getCurrentPage()
        );
    }
}
