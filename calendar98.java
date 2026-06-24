import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class calendar98{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2026));
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
    }
}