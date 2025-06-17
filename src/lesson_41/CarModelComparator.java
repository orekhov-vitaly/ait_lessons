package lesson_41;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        String model1 = c1.getModel();
        String model2 = c2.getModel();
        return model1.compareTo(model2);
    }
}
