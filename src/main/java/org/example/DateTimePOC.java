package org.example;

import java.time.*;

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
    }
}