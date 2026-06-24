import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class datetimeformatter{
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.now();//This is the date
        System.out.println(dt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");//This is the forrmat
        String mydate = dt.format(f);//Creating date string using date and format
        System.out.println(mydate);
    }
}