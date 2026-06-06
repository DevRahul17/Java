/*-----------------Recursion---------------------------------*/
/*Factorial using recursion.*/
class recursion{
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        int num = 4;
        System.out.println("The factorial of " + num + " is " + factorial(num));
    }
}

/*Factorial using for loop.*/
class recursion{
    public static void main(String[] args){
        int num = 4;
        int factorial = 1;
        for(int i = 1;i <= num;i++){
            factorial = factorial*i;
        }
        System.out.println("The factorial is " + factorial);
    }
}

/*Fibonacci Series.*/
import java.util.Scanner;

class recursion{
    static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        System.out.println("The Fibonaaci number at position " + num + " is " + fib(num));
    }
}