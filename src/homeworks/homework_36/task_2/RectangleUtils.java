package homeworks.homework_36.task_2;

import lists.MyList;

public class RectangleUtils {
    public static <T extends Rectangle> void removeDuplicates(MyList<T> list, T object) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(object)) {
                list.remove(i);
                i--;
            }
        }


    }
}
