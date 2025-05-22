package lesson_26.init_blocks;

import java.sql.SQLOutput;

public class StaticBlockDemo {

    // Инициализация статических полей
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10;

    // Статический блок инициализации
    // В нем могут быть проинициализированы статические поля класса
    // (присвоены начальные значения статики)
    // Статический блок инициализации вызывается ТОЛЬКО один раз в момент загрузки
    // статический блок инициализации запускается до вызова конструктора класса
    static {
        System.out.println("Static Block RUN!");
        colors = new String[5];
        colors[0] = "red";
        colors[0] = "green";
        colors[0] = "yellow";
    }

    // НЕ статический блок инициализации
    // Выполняется прикаждом создании объекта
    // Вызывается до конструктора
    {
        System.out.println("NON-static block RUN!");
        title = "Default title";
    }

    public StaticBlockDemo(int capacity) {
        System.out.println("Second constructor RUN!");
        this.capacity = capacity;
    }

    public StaticBlockDemo() {
        System.out.println("Empty constructor RUN!");
        capacity = 30;
    }

    public void info() {
        System.out.println("title: " + title + ", capacvity: " + capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
