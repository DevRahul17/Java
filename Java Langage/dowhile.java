/*---------------Do Whilw--------------------*/
class dowhile{
    public static void main(String[] args){
        int i = 5;
        do{
            System.out.println(i);
            i++;
        }while(i <= 50);
    }
}

/*Q.WAP to to print n natural numbers from 1 to n.*/
import java.util.Scanner;

class dowhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from which you want to print:");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i < n);
    }
}