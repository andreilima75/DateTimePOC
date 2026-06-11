package org.example;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;

public class JodaPoc {

    static void main() {
        DateTime now = DateTime.now();
        DateTime zoned = DateTime.now(DateTimeZone.forID("America/New_York"));

        DateTime parsed = DateTime.parse("2025-12-25T14:30:00");

        DateTime tomorrow = now.plusDays(1);

        Duration duration = new Duration(now, now.plusHours(5));

        System.out.println("Now: " + now);
        System.out.println("zoned: " + zoned);
        System.out.println("parsed: " + parsed);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("duration: " + duration);
    }
}
