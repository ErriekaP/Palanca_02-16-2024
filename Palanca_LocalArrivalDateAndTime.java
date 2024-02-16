import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Palanca_LocalArrivalDateAndTime {

static LocalDateTime arrival(ZonedDateTime departure, Duration flightTime){
    ZoneId here = ZoneId.systemDefault();
    ZonedDateTime newZonedDateTime = departure.withZoneSameInstant(here);
    return newZonedDateTime.plus(flightTime).toLocalDateTime();
}

public static void main(String[] args){
    ZonedDateTime harareDeparture = ZonedDateTime.of(LocalDateTime.of(2015, 12, 1, 9, 15),
    ZoneId.of("Africa/Harare"));

    Duration harareFlightTime = Duration.ofHours(20);
    LocalDateTime arrival = arrival(harareDeparture, harareFlightTime);
    System.out.println(arrival);

}
}
