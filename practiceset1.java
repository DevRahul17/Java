/*-------------------------Question 1--------------------------*/
class practiceset1{
    public static void main(String[] args){
        int a = 24;
        int b = 76;
        int c = 94;
        int sum = a+b+c;
        System.out.println(sum);
    }
}
/*--------------------Question 2-----------------------*/
class practiceset1{
    public static void main(String[] args){
        float totalmarks = 300;
        float a = 95;
        float b = 85;
        float c = 87;
        float sum = a+b+c;
        float cgpa = sum/totalmarks * 10;
        System.out.print("CGPA = ");
        System.out.println(cgpa);
    }
}
/*------------------------------Question 3-------------------------------------*/
import java.util.Scanner;

class practiceset1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String str = sc.nextLine();
        System.out.println("Hello " + str + " have a good day!");
    }
}
/*-------------------Question 4---------------*/
import java.util.Scanner;

class practiceset1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometer:");
        double kilometer = sc.nextDouble();
        double miles = kilometer/1.6;
        System.out.println("Miles is " + miles );
    }
}

/*-----------------Question 5---------*/
import java.util.Scanner;

class practiceset1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        System.out.println(sc.hasNextInt());
    }
}
/*---------Operators--------------------------------*/

class practiceset1{
    public static void main(String[] args){
        int a = 4;
        a += 3;//Assisgnment Operator
        int b = a + 5;//Arithmetic Operator
        System.out.println(a);
        System.out.println(a>=1);//Comparison Operator
        System.out.println(64>a && a<64);//Logical Operator
        System.out.println(64>a || 5<4);
    }
}
/*------------------*/
class practiceset1{
    public static void main(String[] args){
        int a = 60*5-34/2;
        int b = 60/5-34*2;//Precedence And Assosociativity
        System.out.println(a);
        System.out.println(b);
    }
}