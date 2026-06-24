/*Q1.Create an arraylist and store names of 7 students inside it .*/
import java.util.ArrayList;

class practiceset15{
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();//Creating object
        arr.add("Rahul");
        arr.add("Shagun");
        arr.add("Alia");
        arr.add("Elon Musk");
        arr.add("Harry");
        arr.add("Rihan");
        arr.add("Prithvi");
        for(int i = 0;i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}

/*Q2.Use the date class in java to print time in the following format:
21:47:01 .*/
import java.util.Date;

class practiceset15{
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());
    }
}

/*Q3.Repeat Q2 using calendar class.*/
import java.util.Calendar;

class practiceset15{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
    }
}

/*Q4.Repeat Q2 with using java time API.*/
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class practiceset15{
    public static void main(String[] args){
        LocalTime t = LocalTime.now();//For time
        System.out.println(t);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:ss");//For format
        String mytime = t.format(dt);//Creating String for date and format
        System.out.println(mytime);
    }
}

/*Q5.Create a set in java.Try to store duplicate elements inside this set and verify 
that only one instance is stored.*/
import java.util.HashSet;

class practiceset15{
    public static void main(String[] args){
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(3);
        h.add(7);
        System.out.println(h);
    }
}