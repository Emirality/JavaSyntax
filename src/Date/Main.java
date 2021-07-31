package Date;

import java.time.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();


        //System.out.println(localDate);

        ZoneId zoneId = ZoneId.of("Europe/Luxembourg");
        LocalDate date = LocalDate.now(zoneId);
        LocalTime time = LocalTime.now(zoneId);

        LocalDateTime localDateTime = LocalDateTime.now(zoneId);

        // creating a new ZonedDateTime object
        ZonedDateTime zonedatetime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedatetime);





    }
}
