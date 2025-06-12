package lesson_38.enums;

public enum Day {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private String russian;
    private int dayOfWeek;

    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        this.dayOfWeek = dayOfWeek;
    }

    // Конструктор может быть перегружен
//    Day(String russian) {
//        this.russian = russian;
//        this.dayOfWeek = dayOfWeek;
//    }

    public String testMethod() {
        return String.format("%s - русский перевод: %s, номер дня недели: %d", this.name(), russian, dayOfWeek);
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
