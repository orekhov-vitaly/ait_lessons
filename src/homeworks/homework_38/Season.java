package homeworks.homework_38;

public enum Season {
    WINTER("Зима", -7),
    SPRING("Весна", 15),
    SUMMER("Лето", 26),
    AUTUMN("Осень", 12);

    private String translate;
    private int avgTemperature;

    Season(String translate, int avgTemperature) {
        this.translate = translate;
        this.avgTemperature = avgTemperature;
    }

    public String getTranslate() {
        return translate;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "avgTemperature=" + avgTemperature +
                '}';
    }
}
