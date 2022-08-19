package loadgenerator.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        DateTime dt =  new DateTime(DateTimeZone.getDefault());
        System.out.println(dt.getHourOfDay());
        System.out.println(DateTimeZone.getDefault());
    }
}
