/*-----------------Else-If Conditions--------------------------*/
import java.util.Scanner;

class elseif{
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if(age>=60){
            System.out.println("You can vote for Lok Sabha!");
        }
        else if(age>=45){
            System.out.println("You can vote for Rajya Sabha!");
        }
        else if(age>=30){
            System.out.println("You can vote for Panchayat!");
        }
        else{
            System.out.println("You can vote for Childrens!");
        }
    }
}