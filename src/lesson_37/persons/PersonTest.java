package lesson_37.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    /*
    1. Беру валидный email.
    2. Устанавливаю его сеттером person-у
    3. Мы ожидаем, что у person в поле email будет значение, которое мы назначили на шаге 2.
     */

    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test1111@test.com.de"})
    void testValidEmailSet(String validEmail) {
        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берем НЕ валидный email.
    2. Устанавливаем его сеттером в person.
    3. Ожидаемый результат: Email установлен не будет:
        3.1. Поле email у person НЕ будет равно "не валидный email"
        3.2. Значение в поле email должно остаться прежним.
     */
}