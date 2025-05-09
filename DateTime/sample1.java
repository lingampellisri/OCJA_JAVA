import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
class sample1
{

    public int Short()
    {
        return 0;

    }
    public static void main(String args[])
    {
//          LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
//           LocalTime time3 =  LocalTime.of(6, 15, 30, 200);  
//         // LocalDateTime dt=LocalDateTime.now();
//          LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
//  LocalDateTime dateTime2 = LocalDateTime.of(date1, time3);

//         System.out.println(dateTime1);
//         System.out.println(dateTime2);



//    .minusDays(1).minusHours(10).minusSeconds(30).plusYears(1);

//        System.out.println(dateTime);


//          LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
//   LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//   Period period = Period.ofYears(1).ofMonths(1).ofWeeks(1).ofDays(1);               // create a period

//   System.out.println(period);
// LocalDateTime dateTime = LocalDateTime.of(date, time);
//         LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//  LocalTime time = LocalTime.of(5, 15);
//  LocalDateTime dateTime = LocalDateTime.of(date, time);
// System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
//  System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
//  System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
// DateTimeFormatter shortDateTime = 
//     DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

//  System.out.println(shortDateTime.format(time));

// LocalDate date=LocalDate.of(2025,04,14);
// LocalTime time=LocalTime.of(9,44,30);

// LocalDateTime datetime=LocalDateTime.of(date,time);
// System.out.println("date:"+date);
// System.out.println("time:"+time);
// System.out.println("datetime :"+datetime);

// System.out.println(datetime.format(DateTimeFormatter.ISO_LOCAL_TIME));

// DateTimeFormatter sdt= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

 ArrayList<String> list = new ArrayList<>();

        // Compiles ✅
        list.remove(0);  // Runtime error ❌ IndexOutOfBoundsException
    }

}