package lists;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Objects;

public class MyArrayList <T> implements MyList<T> {
    private T[] array;
    private int cursor;

    // Методы, которые будут расширять функционал массива

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        // Стирание типов. Невозможно создать объект типа T

        this.array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(T[] numbers) {
        if(numbers == null || numbers.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[numbers.length * 2];
            addAll(numbers);
        }
    }

    // Добавить один элемент в массив
    public void add(T value) {
        if (cursor == array.length) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Расширить длину массива
    @SuppressWarnings("unchecked")
    private void expandArray() {
        //System.out.println("Expand. Cursor = " + cursor);

        T[] newArray = (T[]) new Object[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    // Добавить в массив нескольких значений
    @Override
    public void addAll(T... numbers) {
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
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }

        return null;
    }

    // Удалить элемент массива по индексу
    public T remove(int index) {
        if (index >= 0 && index < cursor) {
            T value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {
            return null;
        }
    }

    // Вернуть индекс элемента массива по первому вхождению
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            // TODO null-сравнение
            if (Objects.equals(array[i], value)) {
                return i;
            }
        }
        return -1;
    }

    // Вернуть индекс элемента массива по последнему вхождению
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (Objects.equals(array[i], value)) {
                return i;
            }
        }
        return -1;
    }

    // Удалить элемент массива по значению
    public boolean remove(T value) {
        int index = indexOf(value);
        if(index<0) return false;
        remove(index);
        return true;
    }

    // Массив, состоящий из элементов магического массива
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        //T[] result = (T[]) new Object[cursor];

        Class<T> clazz = (Class<T>) array[0].getClass();

        if(cursor == 0) return null;

        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        return result;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    @Override
    public void set(int index, T value) {
        if(index >= 0 && index < cursor) {
            array[index] = value;
        }
    }

    // Требует реализовать интерфейс Iterable
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < cursor;
        }

        @Override
        public T next() {
            T value = array[currentIndex];
            currentIndex++;
            return value;
        }
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