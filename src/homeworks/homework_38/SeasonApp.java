package homeworks.homework_38;

public class SeasonApp {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println("Сезон: " + season.getTranslate() + "; средняя температура: " + season.getAvgTemperature() + "℃");
        }
    }
}
