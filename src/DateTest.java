import java.time.Clock;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Date;

public class DateTest {
public static void main(String[] args) {
	Date d=new Date();
	//System.out.println(d);
	
	LocalDate loca= LocalDate.now();
	//System.out.println(loca.isLeapYear());
	//System.out.println(loca.getDayOfWeek().toString());
	
	OffsetDateTime time=OffsetDateTime.now();
	System.out.println(time);
	
	OffsetTime time1=OffsetTime.now();
	System.out.println(time1);
	Clock clock = Clock.systemDefaultZone();
	System.out.println(clock);                      //SystemClock[Asia/Calcutta]
	System.out.println(clock.instant().toString()); //2013-05-15T06:36:33.837Z
	System.out.println(clock.getZone()); 
}
}


//Thu May 07 12:05:04 IST 2020