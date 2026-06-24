/*-------------Switch Case-------------------*/
import java.util.Scanner;

class switchcase{
    public static void main(String[] args){
        int age = 19;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();

        switch(age){
            case 17:
                System.out.println("Age is 17");
                break;
            case 18:
                System.out.println("Age is 18");
                break;
            case 19:
                System.out.println("Age is 19");
                break;
            default:
                System.out.println("Nothing Matched");
        }
    }
}

/*--------------Charcter Input By Switch Case-------------------*/
class switchcase{
    public static void main(String[] args){
        char ch = 'r';

        switch(ch){
            case 'a':
                System.out.println("a");
                break;
            case 'r':
                System.out.println("r");
                break;
            case 'h':
                System.out.println("h");
                break;
            default:
                System.out.println("No Character is matched");
        }
    }
}