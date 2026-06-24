/*Q1.WAP to find out whether a student is pass or fail.If it requires total 40% and atleast 33% in each subject to pass.
Assume 3 subjects and take marks as input from the user.*/
import java.util.Scanner;

class practiceset4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        int marks1 = sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int marks2 = sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int marks3 = sc.nextInt();
        int percentage = (marks1 + marks2 + marks3)/3;
        if(percentage >= 40 && marks1 >=33 && marks2 >= 33 && marks3 >= 33){
            System.out.println("You are pass!");
        }
        else{
            System.out.println("You are fail!");
        }
    }
}

/*Q2.Calculate Income Tax paid by an employee to the government as per the slabs mentioned below:
Income Tax                      Slab
2.5L - 5.0L                     5%
5.0L - 10.0L                    20%
Above 10.0L                     30%
Note that there is no tax below 2.5L.Take input amount as an input from the user.*/
import java.util.Scanner;

class practiceset4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs:");
        float income = sc.nextFloat();
        float tax = 0;
        if(income < 2.5){
            System.out.println("No tax for you!");
        }
        else if(income > 2.5 && income <=5){
            tax = 0.05f * income;
            System.out.println(tax);
        }
        else if(income > 5 && income <= 10){
           tax =0.20f * income;
            System.out.println(tax);
        }
        else{
            tax = 0.30f * income;
            System.out.println(tax);
        }
    }
}

/*Q3.Write a java program to find out the day of the week given the number[1 for monday,2 for tuesday...and so on!].*/
class practiceset4{
    public static void main(String[] args){
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}
