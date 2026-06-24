import java.util.Date;

class dateandtime{
    public static void main(String[] args){
        //System.out.println(Long.MAX_VALUE);//For finding long maximum value
        //System.out.println(System.currentTimeMillis());//For finding milliseconds since 1900
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
    }
}