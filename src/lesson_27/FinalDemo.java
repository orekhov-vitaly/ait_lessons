package lesson_27;

public class FinalDemo {
    // Для примитивных типов данных, помеченных как final
    // После инициализации (присвоения первого значения)
    // - изменить значение в переменной будет нельзя
    private final int capacity;

    // Ссылочный тип данных. Нельзя изменить значение переменной.
    private final int[] ints = new int[5];

    private int notFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // this.capacity++; // Нельзя изменить значение

        // Нельзя присвоить ссылку на другой объект или null
        // this.ints = new int[2];

        // но можно изменять состояние
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 400;
    }

    public void finalArguments(final int x, final int[] array) {
        // нельзя изменить x
        // x++;

        // нельзя присвоить ссылку на новый объект
        // array = new int[10];

        // Можно изменять состояние объекта
        array[0] = x;
        array[1] = 1000;
    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }

}
