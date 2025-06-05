package lesson_34;

import lesson_33.GenericBox;

public class Wrappers {

    /*
    * Классы-обертки используются для представления примитивных типов как объекты, т.е. как ссылочные типы данных.
    *
    * Byte - byte
    * Short - short
    * Integer - int
    * Long - long
    * Double - double
    * Float - float
    * Character - char
    * Boolean - boolean
    * */

    public static void main(String[] args) {
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("MaxValue: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

//        int x = null; // Примитивы null не поддерживают
        maxValue = null; // Обертки поддерживают значение null

        // Приведение типов. Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // Автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int priminiveInt = wrapperInt; // Автораспаковка ссылочного типа Integer в примитив int
        System.out.println("priminiveInt: " + priminiveInt);

        // Сравнение объектов. Чтобы сравнить объекты по значению, следует использовать метод equals()

        Integer a = 127; // Создается объект со своим адресом в памяти
        Integer b = 127; // Объект с таким значением уже сть. Новый не создается - выдается ссылка на уже существующий.

        // Сравниваем значения переменных (т.е. адреса объектов, хранящиеся в переменных)
        System.out.println("127 == 127: " + (a == b));
        System.out.println("127.equals(127): " + a.equals(b));

        Integer c = 128; // Создается объект со своим адресом в памяти
        Integer d = 128; // Создается новый объект со своим адресом в памяти. Не проверяется наличие объекта с таким
        // значением.

        System.out.println("128 == 128: " + (c == d)); // false
        System.out.println("128.equals(128): " + c.equals(d)); // true

        // Общие или схожие методы, которыми обладают классы-обертки

        // .valueOf() - преобразует явным образом примитив или строку в объект типа его обертки. Явная упаковка.

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127"); // возвращает ссылочный тип данных
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf("154.56"); // возвращает ссылочный тип данных
        System.out.println("dbl: " + dbl);

        System.out.println("==================\n");

        // parseXXX() - метод преобразует строку в соответствующий примитив.
        double dblP = Double.parseDouble("456"); // возвращает примитив
        Double dblD = Double.valueOf("456"); // возвращает ссылочный тип данных

        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("123")); // возвращает примитив

        // toString() - переопределен у всех оберток
        Boolean flag = Boolean.FALSE;
        System.out.println(flag);
        flag = true;
        System.out.println(flag);

        // equals() - сравнивает два объекта по значения (сравнивает на равентво)

        // compareTo() - сравнение текущего объекта с другим объектом того же типа
        // Кто больше?
        // Возращаемое значение типа int

        /*
        i1, i2 сравниваем. i1.compareTo(i2); 10.compateTo(5)
        i1 > i2 -> положительное
        i1 < i2 -> отрицательное
        i1 = i2 -> ноль
        */

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println("127.compareTo(256): " + i1.compareTo(i2));
        System.out.println("256.compareTo(127): " + i2.compareTo(i1));
        System.out.println("==================\n");

        // xxxValue() - возвращает значение обертки как примитивный тип
        // doubleValue(), intValue() и т.д.

        Double d2 = 123.56; // Автоупаковка (примитив -> обертка)
        d2 = Double.valueOf(125.67); // Явная упаковка
        double dPrimitive = d2; // автораспаковка (обертка -> примитив)
        dPrimitive = d2.doubleValue(); // Явная распаковка
        System.out.println("==================\n");

        /*
        Все числовые обертки над примитивами наследуются от абстрактного класса Number.
        Byte, Short, Integer, Long, Float, Double
        Эти классы обладают методами, унаследованными от Number, которые позволяют извлекать значение объекта в
        различных примитивных форматах.

        byteValue();
        shortValue();
        intValue();
        longValue();
        floatValue();
        doubleValue();
        */

        Integer integer = 31844;

        double dVal = integer.doubleValue();
        System.out.println(dVal);
        System.out.println(integer.floatValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);

        System.out.println("dWrapper.byteValue(): " + dWrapper.byteValue());

        GenericBox<Integer> intBox = new GenericBox<>(15);
        System.out.println(intBox);

        GenericBox<Integer> intBox2 = new GenericBox<>(50);
        int sum = intBox.getValue() + intBox2.getValue();
    }
}
