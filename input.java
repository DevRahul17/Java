/*---------------Input-----------------------*/
import java.util.Scanner;

class input{
    public static void main(String[] args){
        System.out.println("Taking Input From User:");
        Scanner sc = new Scanner(System.in);//Syntax for input from user
        
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}

import java.util.Scanner;

class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Floating number 1:");
        float a = sc.nextFloat();
        System.out.println("Enter Floating number 2:");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println(sum);
    }
}

import java.util.Scanner;

class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking Input From User");

        boolean b = sc.hasNextInt();//For Checking Input Number Is boolean or not and hasNextInt where N is here capital
        System.out.println(b);
        String str = sc.next()//Not read with space
        System.out.println(str);  
        String str = sc.nextLine();//Read with space
        System.out.println(str);
    }
}

/*---------Exercise 1 -------------------------------------------*/

import java.util.Scanner;

class input{
    public static void main(String[] args){
        float totalmarks = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks For Each Subject:");

        System.out.println("Enter Marks For Subject 1:");
        float a = sc.nextFloat();
        System.out.println("Enter Marks For Subject 2:");
        float b = sc.nextFloat();
        System.out.println("Enter Marks For Subject 3:");
        float c = sc.nextFloat();
        System.out.println("Enter Marks For Subject 4:");
        float d = sc.nextFloat();
        System.out.println("Enter Marks For Subject 5:");
        float e = sc.nextFloat();
        
        float sum = a+b+c+d+e;
        float percentage = sum/totalmarks * 100;
        System.out.print("Percentage is :");
        System.out.println(percentage);
    }
}

