package lesson_41;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getMaxSpeed() - c2.getMaxSpeed();
    }
}
