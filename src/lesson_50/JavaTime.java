package lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTime {
    public static void main(String[] args) {
        // LocalDate - (YYYY-MM-DD)
        LocalDate date = LocalDate.now();

        LocalDate tomorrow = date.plusDays(1);

        System.out.println("date: " + date);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks: " + date.plusWeeks(4));
        System.out.println("yesterday: " + date.minusDays(1));

        LocalDate date1 = LocalDate.of(2002, 2, 15);
        System.out.println("date1: " + date1);

        date1 = LocalDate.of(2003, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);

        System.out.println("year: " + date1.getYear() + "; month-enum: " + date1.getMonth() + "; month-number: " + date1.getMonthValue());
        System.out.println("date: " + date1.getDayOfMonth() + "; day of week: " + date1.getDayOfWeek() + "; day of " +
                "year: " + date1.getDayOfYear());
        System.out.println("days in month: " + date1.lengthOfMonth() + "; day in year: " + date1.lengthOfYear() + "; " +
                "is leap: " + date1.isLeapYear());

        String dateString = "2000-01-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println("date2: " + date2 + "; " + date2.getYear());

        System.out.println("\n======= Local Time =========");
        // LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("time: " + time);

        time = LocalTime.of(21, 33);
        System.out.println("time: " + time);

        time = LocalTime.of(21, 33, 44);
        System.out.println("time: " + time);

        time = LocalTime.of(21, 33, 44, 546342);
        System.out.println("time: " + time);

        System.out.println("time.plusHours(1): " + time.plusHours(1));
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.plusSeconds(65): " + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());

        String timeStr = "12:33:45";
        LocalTime time1 = LocalTime.parse(timeStr);
        System.out.println("time1: " + time1 + " | " + time1.getMinute());

        // ISO-8601 - "2001-01-15T08:15:45+01:00"

        System.out.println("\n========= LocalDatetime =========");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        LocalDate localDate = LocalDate.of(2011, 8, 15);
        LocalTime localTime = LocalTime.of(15, 33, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("datetime: " + dateTime);
        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());

        System.out.println(dateTime.plusHours(1));
        System.out.println(dateTime.minusYears(10));

        String strDT = "2001-01-15T08:15:45";
        LocalDateTime parseDT = LocalDateTime.parse(strDT);
        System.out.println("parseDT: " + parseDT);

        System.out.println("\n========== ZonedDateTime ==========");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println("\n========== isAfter, isBefore, until, equals ==========");
        LocalDate date3 = LocalDate.of(2020,10,15);
        LocalDate date4 = LocalDate.of(2020,6,10);

        System.out.println("date3.isAfter(date4): " + date3.isAfter(date4));
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));

        System.out.println("date3.equals(date4): " + date3.equals(date4));
        System.out.println("date3.isEqual(date4): " + date3.isEqual(date4));

        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("date3.until(date4): " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println(dateTime1.until(dateTime2, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.HOURS);
        System.out.println(dateTime3);
        System.out.println(dateTime3.plus(5, ChronoUnit.YEARS));

        System.out.println("\n======== Duration, Period, Instant =======");
        // Duration - short (Hours, Minutes, Seconds)
        // Period - long (Days, Months, Years)

        // Instant - from 1970.01.01 UTC
        Instant instant = Instant.now();
        System.out.println("instant: " + instant.getEpochSecond());

        System.out.println("\n======== DateTimeFormatter =======");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        String formatedString = now.format(formater);
        System.out.println("formatedString: " + formatedString);
        /*
        y - year
        M - month
        d - day
        H - hour (0-23)
        h - hour (0-12)
        a - AM/PM
        m - minute
        s - secund
         */

        System.out.println("\n===============\n");

        String dateForParse = "2023-10-26 19:15";
        System.out.println("dateForParse: " + dateForParse);

        DateTimeFormatter formator1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parseLDT = LocalDateTime.parse(dateForParse, formator1);

        System.out.println("parseLDT: " + parseLDT);
        System.out.println(parseLDT.getDayOfWeek().getValue() + " | " + parseLDT.getHour());

        System.out.println("\n===============\n");
        /*
        "15-12-2022 20-46"
        Запарсить строку в формат LocalDateTime
        Распечатать отдельно месяц, день, час из объекта LDT
         */

        String dateForParse2 = "15-12-2022 20-46";
        DateTimeFormatter formator2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseLDT2 = LocalDateTime.parse(dateForParse2, formator2);

        System.out.println("parseLDT2: " + parseLDT2);
        System.out.println(parseLDT2.getMonth());
        System.out.println(parseLDT2.getDayOfMonth());
        System.out.println(parseLDT2.getHour());

        System.out.println("\n===============\n");
        /*
        13-01-2023 00-47
        Какому дню недели соответствует вторая дата
        Сколько дней между этими двумя датами
         */
        String dateForParse3 = "13-01-2023 00-47";
        LocalDateTime parseLDT3 = LocalDateTime.parse(dateForParse3, formator2);
        System.out.println(parseLDT3.getDayOfWeek());
        long between3 = parseLDT3.until(parseLDT2, ChronoUnit.DAYS);
        System.out.println("parseLDT3.until(parseLDT2): " + between3);
    }
}
