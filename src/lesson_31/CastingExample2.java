package lesson_31;

/*
* Кастинг бывает двух видов:
*
* - Восходящее преобразование (upcasting)
* - Нисходящее преобразование (downcasting)
* */

import lesson_30.animals.Animal;
import lesson_30.animals.Cat;
import lesson_30.animals.Dog;
import lesson_30.animals.Hamster;

public class CastingExample2 {
    public static void main(String[] args) {

        // Восходящее преобразование происходит автоматически
        Animal animal = new Cat();

        animal.voice();
        // animal.eat(); // Не доступен, так как метод отсутствует у типа Animal

        Animal animal2 = new Hamster();

        animal2.voice();

        System.out.println("============\n");

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = new Dog();

        testAnimals(new Cat());
        testAnimals(new Dog());
        testAnimals(new Hamster());

        Animal animalD = new Dog(); // Upcasting

        // animalD.bark(); // Метод не доступен
        Dog dog = (Dog) animalD;
        dog.bark();

        // Если попытаться привести объект к неверному типу - будет ошибка компеляции ClassXastExaption
        Animal animalCat = new Cat();
//        Dog dog1 = (Dog) animalCat;

        // но можно проверить - можно ли привести объект к указанному классу
        if(animalCat instanceof Dog) {
            System.out.println("Animal is Cat!");
            Cat cat = (Cat) animalCat;
            cat.eat();
        } else {
            System.out.println("Animal is not Dog - downcasting failed!!!");
        }

        System.out.println("==========\n");

        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();
            System.out.println(currentAnimal.getClass().getName());

            if(currentAnimal instanceof Cat) {
                System.out.println("В ячейке массива " + i + " тип объекта Cat");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat();
            }

            if(currentAnimal instanceof Dog) {
                System.out.println("В ячейке массива " + i + " тип объекта Dog");
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark();
            }

            if(currentAnimal instanceof Hamster) {
                System.out.println("В ячейке массива " + i + " тип объекта Hamster");
                Hamster hamsterLink = (Hamster) currentAnimal;
            }

            System.out.println("==========\n");
        }
    }

    public static void testAnimals(Animal animal) {
        animal.voice();
    }
}
