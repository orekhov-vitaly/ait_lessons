package homeworks.homework_41;

import java.util.Comparator;

public class SportsmanScorComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return s1.getScore() - s2.getScore();
    }
}
