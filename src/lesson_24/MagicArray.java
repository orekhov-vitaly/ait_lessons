package lesson_24;

public class MagicArray {
    int[] array;
    int cursor;

    // Методы, которые будут расширять функционал массива

    public MagicArray() {
        this.array = new int[10];
    }

    // Добавляет в массив один элемент
    void add(int value) {

        if(cursor == array.length) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    void expandArray() {
        System.out.println("Expand. Cursor = " + cursor);

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    // Добавление в массив нескольких значений
    void add(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Возвращает строковое представление массива
    public String toString() {
        if(cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result+=array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if(index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Поправить обработку некорректного индекса

        return -2147483648;
    }

    int remove(int index) {
        if(index >= 0 && index < cursor) {
            int value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {
            // Fixme Поправить возвращаемое значение
            return -2147483648;
        }
    }

    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    boolean removeByValue(int value) {
        return false;
    }
}

/*
0. Динамическое изменение размера массива.
1. Добавлять один элемент в массив.
2. Добавлять в массив сразу несколько значений.
3. Возвращать строковое представление массива.
4. Текущее кол-во элементов в массиве.
5. Возвращать значение по индексу.
6. Удаление элемента по индексу.

7. Удалять элемент по значению. Возвращает boolean (true - если успешно удалено, false - если не удалось удалить).
8. Поиск по значению. Первое вхождение.
9. Поиск по значению. Последнее вхождение.
*/