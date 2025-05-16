package homeworks.homework_11;

/*
Task 3.2
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете ее на печать.
*/

public class Task3_2 {
    public static void main(String[] args) {
        int tempMon = 22;
        int tempTue = 24;
        int tempWed = 24;
        int tempThu = 24;
        int tempFri = 23;
        int tempSat = 19;
        int tempSun = 19;
        double avg;
        avg = (double) (tempMon + tempTue + tempWed + tempThu + tempFri + tempSat + tempSun) / 7;
        System.out.println("Средняя температура: " + avg);
    }
}
