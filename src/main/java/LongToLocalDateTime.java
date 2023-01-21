import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * EstudosJava
 *
 * @author cshen on 07/01/2023.
 */
public class LongToLocalDateTime {

    public static void main(String[] args) {

        System.out.println(convert(1673006400L));;

    }

    public static LocalDateTime convert(final Long value) {
        return Instant.ofEpochSecond(value).atZone(ZoneId.systemDefault()).toLocalDateTime();
        //return Instant.ofEpochMilli(value).atZone(ZoneId.systemDefault()).toLocalDate();

    }

}
