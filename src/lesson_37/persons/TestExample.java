package lesson_37.persons;

import homeworks.homework_26.MathUtil;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // @BeforeEach - Метод, который выполняется перед каждым тестовым методом
    // @BeforeAll - метод выполнится один раз перед выполнением первого тестового метода
    // @AfterEach - метод выполняется после каждого тестового метода
    // @AfterAll - метод выполняется один раз после последнего тестового метода
    // @Disabled - указывает, что тест отключен и выполняться не будет
    @BeforeEach
    void setUp() {
        System.out.println("Method setUp");
    }

    // @Test указывает фреймворку JUnit, что метод является тестовым
    // Таким образом JUnit знает, что этот метод надо запустить во время выполнения тестов
    @Test
    public void testAddition() {
        System.out.println("Test Addition");
        // Протестировать, правильно ли работает метод add  класса Calculator
        double result = MathUtil.sumInt(2, 3);
        // Реаный / фактический результат работы метода
        // Ожидаемое значение - 5

        // Методы проверки утверждений (Assertions)
        assertEquals(5, result); // Тест будет пройден, если два значения равны
        Assertions.assertNotEquals(0, result); // Тест будет пройден, если фактический результат не совпадает с
        // ожидаемым
        Assertions.assertTrue(result >= 4); // Проверяет, что условие верно
        assertEquals(10, 5 + 5);
        assertFalse(result > 10);
        assertNull(null);
        assertNotNull("String");
    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Empty Test");
        // Если в методе нет ложного утвердждения, то тест пройденным
        // в том числе пустой метод без утверждений считается пройденным
    }

    // Параметризованные тесты
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("Current value: " + fruit);
        assertTrue(fruit.length() > 0);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testInts(int value) {
        System.out.println("Current integer: " + value);
        assertTrue(value != 0);
    }

    // @CsvSource
    // @CsvFileSource
    @ParameterizedTest
    @CsvSource({"apple, 1", "banan, 2", "cherry, 3"})
    void testWithCsvSource(String fruit, int rank) {
        System.out.println("Fruit: " + fruit + " Rank: " + rank);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSource(int value) {
        System.out.println("current value: " + value);
        assertNotEquals(100, value);
    }

    // Источник данных - статический метод
    static Stream<Integer> testDataFruits() {
        return Stream.of(1, 2, -10, 0, 16);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 16, false)
        );
    }
}