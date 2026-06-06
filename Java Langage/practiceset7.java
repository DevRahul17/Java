/*------Practiceset7-----------------------*/
/*Q1.WAp using methods to print multiplication table of n.*/
class practiceset7{
    static void table(int n){
        for(int i = 1;i < 11;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
}
    public static void main(String[] args){
        table(10);
    }
}

/*Q2.WAP to print pattern:
*
**
***
****.*/

class practiceset7{
    static void printstar(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printstar(4);
    }
}

/*Q3.Write a recursve function to print sum of first n natural numbers.*/
class practiceset7{
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(sum(3));
    }
}

/*Q4.WAP to print pattern:
****
***
**
*.*/

class practiceset7{
    static void printstar(int n){
        for(int i = 0;i < n;i++){
            for(int j = n;j > i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printstar(4);
    }
}

/*Q5.Write a function to find average of a set of numbers passed as argumentsh.Hint using variable arguments.*/
class practiceset7{
    static int avg(int ...arr){
        int sum = 0;
        for(int element:arr){
            sum = sum + element;
        }
        return sum/arr.length;
    }
    public static void main(String[] args){
        System.out.println("Average " + avg(2,4));
        System.out.println("Average " + avg(5,10));
        System.out.println("Average " + avg(10,100));
    }
}

/*Q6.WAP to print pattern:
*
**
***
**** using recursion.*/
class practiceset7{
    static void star(int n){
        if(n == 0){//Base Case
            return;
        }
        star(n-1);//Print smaller pattern first 
        for(int i = 0;i < n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args){
        star(4);
    }
}

/*Q7./*Q4.WAP to print pattern:
****
***
**
* using recursion.*/
class practiceset7{
    static void star(int n){
        if(n == 0){
            return;
        }
        for(int i = 0;i < n;i++){
            System.out.print("*");
        }
        System.out.println();
        star(n-1);//Recursive Call for decresing order
    }
    public static void main(String[] args){
        star(4);
    }
}

/*Q8.WAP by using method to convert celsius to fahrenheit.*/
import java.util.Scanner;

class practiceset7{
    static int convertor(int n){
        int f = (9 * n / 5) + 32;
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Enter Celsius");
        c = sc.nextInt();
        System.out.println("In Fahrenheit it is " + convertor(c));
    }
}



