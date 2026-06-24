/*Q1.What will be the result of the following expression float a = 7/4*9/2.........*/
class practiceset2{
    public static void main(String[] args){
        float a = 7/4f * 9/2f;
        System.out.println(a);
    }
}

/*Q2.Write a java program to encrypt a grade by adding 8 to it.Decrypt it to show the correct grade.*/
class practiceset2{
    public static void main(String[] args){
        char grade = 'B';
        grade = (char)(grade + 8);//Here i typecaste grade because sum of int and char is int
        System.out.println(grade);

        //Decrypting
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}

/*Q3.Use comparison operators to find out whether a given number is greater than the user entered number or not.*/
import java.util.Scanner;

class practiceset2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>7);//Here given number is 7 and if user no. is > than 7 so print true else false
    }
}

/*Q4.Write the folowing expression in java v^2 - u^2/2as.*/
class practiceset2{
    public static void main(String[] args){
        int v = 4,u = 10,a = 2,s = 5;
        int result = (v*v -u*u)/(2*a*s);
        System.out.println(result);
    }
}

/*Q5.Find the value of a - 
int x = 7 
int a = 7*49/7+35/7.*/
class practiceset2{
    public static void main(String[] args){
        int x = 7;
        int a = 7*49/7 + 35/7;
        System.out.println(a);
    }
}
