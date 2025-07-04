package lesson_33;

/*
* Дженерики предоставляют возможность создавать классы, в которых типы данных задаются параметром.
*
* Мы создаем униерсальный класс и не указываем конкретный тип данных, с которым он работает.
* Мы хотип определять тип данных при создании каждого объекта.
* */

// <T> - символ-заполнитель. Синтаксис указывает, что этот класс является обобщенный (дженерик-класс), способный
// работать с объектами любого типа, который будет указан в момент создания объекта

// Дженерики работют ТОЛЬКО со ссылочными типвми данных! Дженерики не работают с примитивными типами данных.
public class GenericBox <T> { // T - type, E - element, K - key, V - value
    // Вместо конкретного типа данных используется символ-заполнитель
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
