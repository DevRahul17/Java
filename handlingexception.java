import java.util.Scanner;

class handlingexception{
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int index = sc.nextInt();

        System.out.println("Enter the number from which you want to divide");
        int num = sc.nextInt();
        try{
            System.out.println("The value at array index entered is " + marks[index]);
            System.out.println("The value by dividing array index by number is " + marks[index]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds exception occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some exception occured!");
            System.out.println(e);
        }
    }
}