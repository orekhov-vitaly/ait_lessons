package homeworks.homework_11;

/*
Task 3.1
Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
*/

public class Task3_1 {
    public static void main(String[] args) {
        double itemA = 1000;
        double itemB = 500;
        double discountPercent = 10;
        double discountSum = (itemA + itemB) * discountPercent / 100;
        double totalPrice = itemA + itemB - discountSum;
        System.out.println("Сумма товара со скидкой: " + totalPrice);
        System.out.println("Сумма скидки: " + discountSum);
    }
}
