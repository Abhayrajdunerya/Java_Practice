package date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class New_Date_Time_API {

    public static void localDateDemo() {
        System.out.println("\n---------------------------------------> LocalDate START <------------------------------------------");
        LocalDate anyDate = LocalDate.of(1947, 8, 15);
        LocalDate anyDate2 = LocalDate.of(2002, Month.APRIL, 20);
        System.out.println("anyDate: " + anyDate);
        System.out.println("anyDate2: " + anyDate2);
        System.out.println();

        LocalDate todayDate = LocalDate.now();
        System.out.println("Today Date: " + todayDate);
        System.out.println("Year: " + todayDate.getYear());
        System.out.println("Month: " + todayDate.getMonth() + " -> " + todayDate.getMonthValue());
        System.out.println("Day of week: " + todayDate.getDayOfWeek());
        System.out.println("Day of month: " + todayDate.getDayOfMonth());
        System.out.println("Day of year: " + todayDate.getDayOfYear());
        System.out.println("Is Leap Year: " + todayDate.isLeapYear());
        System.out.println("Length of month: " + todayDate.lengthOfMonth());
        System.out.println("Length of year: " + todayDate.lengthOfYear());

        System.out.println("\nminusDays(4): " + todayDate.minusDays(4));
        System.out.println("minusMonths(4): " + todayDate.minusMonths(4));
        System.out.println("minusWeeks(4): " + todayDate.minusWeeks(4));
        System.out.println("minusYears(4): " + todayDate.minusYears(4));

        System.out.println("\nplusDays(4): " + todayDate.plusDays(4));
        System.out.println("plusMonths(4): " + todayDate.plusMonths(4));
        System.out.println("plusWeeks(4): " + todayDate.plusWeeks(4));
        System.out.println("plusYears(4): " + todayDate.plusYears(4));
        
        System.out.println("\ntoString(): " + todayDate.toString());

        // get returns an int 
		 System.out.println("year again: " + todayDate.get(ChronoField.YEAR)); 
		 System.out.println("month again: " + todayDate.get(ChronoField.MONTH_OF_YEAR));
		 System.out.println("day of month again: " + todayDate.get(ChronoField.DAY_OF_MONTH));

        // parse string
        LocalDate parsedDate = LocalDate.parse("1970-01-24"); // yyyy-mm-dd
        System.out.println("parsedDate: " + parsedDate);

        System.out.println("\n---------------------------------------> LocalDate END <------------------------------------------");
        System.out.println();
    }

    public static void localTimeDemo() {
        System.out.println("\n---------------------------------------> LocalTime START <------------------------------------------");

        LocalTime anyTime = LocalTime.of(8, 30, 5);
        System.out.println("anyTime: " + anyTime);
        System.out.println();

        LocalTime currTime = LocalTime.now();
        System.out.println("currTime: " + currTime);
        System.out.println("getHour: " + currTime.getHour());
        System.out.println("getMinute: " + currTime.getMinute());
        System.out.println("getSecond: " + currTime.getSecond());
        System.out.println("getNano: " + currTime.getNano());
        System.out.println("toNanoOfDay: " + currTime.toNanoOfDay());
        System.out.println("toSecondOfDay: " + currTime.toSecondOfDay());
        System.out.println("toString: " + currTime.toString());

        System.out.println("\nminusHours(4): " + currTime.minusHours(4));
        System.out.println("minusMinutes(4): " + currTime.minusMinutes(4));
        System.out.println("minusSeconds(4): " + currTime.minusSeconds(4));
        System.out.println("minusNanos(4): " + currTime.minusNanos(4));
        
        System.out.println("\nplusHours(4): " + currTime.plusHours(4));
        System.out.println("plusMinutes(4): " + currTime.plusMinutes(4));
        System.out.println("plusSeconds(4): " + currTime.plusSeconds(4));
        System.out.println("plusNanos(4): " + currTime.plusNanos(4));
        
        System.out.println("\nwithHour(4): " + currTime.withHour(4));
        System.out.println("withMinute(4): " + currTime.withMinute(4));
        System.out.println("withSecond(4): " + currTime.withSecond(4));
        System.out.println("withNano(4): " + currTime.withNano(4));
        
        // parsing time
        LocalTime parsedTime = LocalTime.parse("10:15:01");
        System.out.println("\nparsedTime: " + parsedTime);
        System.out.println("\n---------------------------------------> LocalTime END <------------------------------------------");
    }

    public static void localDateTimeDemo() {
        System.out.println("\n---------------------------------------> LocalDateTime START <------------------------------------------");
        LocalDateTime anyDateTime = LocalDateTime.of(2002, Month.JANUARY, 23, 16, 30, 52);
        System.out.println("anyDateTime: " + anyDateTime);
        System.out.println();

        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("currDateTime: " + currDateTime);
        System.out.println("currDateTime: " + currDateTime.atZone(ZoneId.of("Asia/Kolkata")));
        System.out.println("currDateTime: " + currDateTime.atZone(ZoneId.of("Europe/London")));
        System.out.println("currDateTime: " + currDateTime.atZone(ZoneId.of("America/Los_Angeles")));
        
        System.out.println("currDateTime: " + currDateTime.getYear());
        System.out.println("currDateTime: " + currDateTime.getMonth() + " - " + currDateTime.getMonthValue());
        System.out.println("currDateTime: " + currDateTime.getDayOfYear());
        System.out.println("currDateTime: " + currDateTime.getDayOfMonth());
        System.out.println("currDateTime: " + currDateTime.getHour());
        System.out.println("currDateTime: " + currDateTime.getMinute());
        System.out.println("currDateTime: " + currDateTime.getSecond());
        System.out.println("currDateTime: " + currDateTime.getNano());

        System.out.println("\n---------------------------------------> LocalDateTime END <------------------------------------------");

    }
    
    public static void zonedDateTimeDemo() {
        System.out.println("\n---------------------------------------> ZonedDateTime START <------------------------------------------");

        LocalTime time = LocalTime.of(9, 00, 00);
        LocalDate gameStartDate = LocalDate.of(2017, Month.JULY, 03);

        // LocalDateTime
		LocalDateTime gameStartTime = LocalDateTime.of(gameStartDate, time);
		System.out.println("gameStartTime: " + gameStartTime);

        ZonedDateTime zonedGameStartTime = ZonedDateTime.of(gameStartTime, ZoneId.of("Europe/London"));
		System.out.println("zonedGameStartTime: " + zonedGameStartTime);

        ZonedDateTime indiaTime = zonedGameStartTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		System.out.println("indiaTime: " + indiaTime);

        System.out.println("\n---------------------------------------> ZonedDateTime END <------------------------------------------");

    }
    
    public static void othersDemo() {
        System.out.println("\n---------------------------------------> Others START <------------------------------------------");
        // Age Calculation
        LocalDate birthDay = LocalDate.of(2002, 1, 23);
        LocalDate today = LocalDate.now();
        Period age = birthDay.until(today);
        System.out.println("\nComplete Age: " + age);
        System.out.println("Age: " + age.getYears());

        System.out.println();

        // Interval timing
        Instant startTime = Instant.now();
        for (int i = 1; i < 1000; i++) {}
        Instant endTime = Instant.now();

        Duration timeElapsed = Duration.between(startTime, endTime);
        System.out.println("timeElapsed in ms: " + timeElapsed);
        System.out.println();

        // Partial Classes
        System.out.println("Christmas: " + MonthDay.of(Month.DECEMBER, 25));
        System.out.println("Credit card expiry date: " + YearMonth.of(2017, Month.JULY));


        System.out.println("\n---------------------------------------> Others END <------------------------------------------");

    } 

    public static void testDateTimeAPI() {
        // localDateDemo();
        // localTimeDemo();
        // localDateTimeDemo();
        // zonedDateTimeDemo();
        othersDemo();
    }
    

    public static void main(String[] args) {
        testDateTimeAPI();
    }
}
