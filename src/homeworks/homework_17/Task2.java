package homeworks.homework_17;

/*
Task 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
*/

public class Task2 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 11) {
            System.out.println("Task" + x);
            x++;
        }
    }
}
