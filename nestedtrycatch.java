import java.util.Scanner;

class nestedtrycatch{
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index");
        int index = sc.nextInt();
        try{
            System.out.println("Welcome");
            try{
                System.out.println(marks[index]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception Occured in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}

/*Q.WAP in java that allows you to keep accesing an array until a valid index is 
given by the user.*/
import java.util.Scanner;

class nestedtrycatch{
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter index");
            int index = sc.nextInt();
            try{
                System.out.println("Welcome");
                try{
                    System.out.println(marks[index]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception Occured in level 2");
                }
            }
            catch(Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks and program ends here");
    }
}