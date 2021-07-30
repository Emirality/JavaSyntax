package Date;

import java.time.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        //System.out.println(localDate);
        //System.out.println(localDateTime);

        ZoneId zoneId = ZoneId.of("Europe/Luxembourg");
        LocalDate date = LocalDate.now(zoneId);
        LocalTime time = LocalTime.now(zoneId);

        // creating a new ZonedDateTime object
        ZonedDateTime zonedatetime = ZonedDateTime.of(date, time, zoneId);
        System.out.println(zonedatetime);



    }
}
