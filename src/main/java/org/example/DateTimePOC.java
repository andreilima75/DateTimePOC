package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimePOC {
    static void main() {
        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedNow = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Today: " + today);
        System.out.println("Current Time: " + nowTime);
        System.out.println("Now (Local): " + now);
        System.out.println("Now (NY Timezone): " + zonedNow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.US);
        String dateStr = "2025-12-25 14:30:00";
        LocalDateTime parsed = LocalDateTime.parse(dateStr, formatter);
        System.out.println("\nParsed: " + parsed.format(formatter));

        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate firstDayNextMonth = today.withDayOfMonth(1).plusMonths(1);

        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Next Month: " + nextMonth);
        System.out.println("First day of next month: " + firstDayNextMonth);

        Period period = Period.between(today, nextMonth);
        Duration duration = Duration.between(now, now.plusHours(5));

        System.out.println("Period (days/months): " + period);
        System.out.println("Duration (hours): " + duration.toHours() + " hours");

        Instant instant = Instant.now();
        System.out.println("Instant (UTC): " + instant);
    }
}