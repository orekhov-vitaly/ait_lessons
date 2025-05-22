package homeworks.homework_25;

public class MagicArrayHomework25 {
    private int[] array;
    private int cursor;

    // Методы, которые будут расширять функционал массива

    public MagicArrayHomework25() {
        this.array = new int[10];
    }

    public MagicArrayHomework25(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[numbers.length * 2];
            add(numbers);
        }
    }

    // Добавить один элемент в массив
    public void add(int value) {

        if (cursor == array.length) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Расширить длину массива
    private void expandArray() {
        System.out.println("Expand. Cursor = " + cursor);

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    // Добавить в массив нескольких значений
    public void add(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Вернуть строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    // Вернуть длину массива
    public int size() {
        return cursor;
    }

    // Вернуть значение по индексу
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Поправить обработку некорректного индекса

        return -2147483648;
    }

    // Удалить элемент массива по индексу
    public int remove(int index) {
        if (index >= 0 && index < cursor) {
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

    // Вернуть индекс элемента массива по первому вхождению
    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Вернуть индекс элемента массива по последнему вхождению
    public int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Удалить элемент массива по значению
    public boolean removeByValue(int value) {
        int result = remove(indexOf(value));
        return result >= 0 && result < cursor;
    }

    // Массив, состоящий из элементов магического массива
    public int[] toArray() {
        int[] result = new int[cursor];

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        return result;
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
10. Конструктор, принимающий обычный массив. Создать магический массив с элементами этого массива.
11. Написать метод, который будет состоять из элементов магического массива.
*/