/*Q1.WAP in java for Syntax,Logical And Syntax errors.*/
class practiceset14{
    public static void main(String[] args){
        int a = 7;
        int b =6//Syntax error
        int c = 8/0;//;ogical error
        System.out.println(c);
    }
}

/*Q2.WAP in java that prints "Wrong Arithmetic" during Arithmetic exception and "Illegal argument" during an Illegal argument exception.*/
class practiceset14{
    public static void main(String[] args){
        try{
            int a = 65/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("Illegal argument");
        }
        catch(ArithmeticException e){
            System.out.println("Wrong Arithmetic");
        }
    }
}

/*Q3.WAP in java that allows you to keep accesing an array until a valid index is given.If max retries exceed 5 printl "Error".*/
import java.util.Scanner;

class practiceset14{
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        int retries = 0;
        Scanner sc = new Scanner(System.in);
        while(retries < 5){
            try{
                System.out.println("Enter the index ");
                int index = sc.nextInt();
                System.out.println("Element = " + arr[index]);
                break;//Exit loop
            }
            catch(ArrayIndexOutOfBoundsException e){
                retries++;
                System.out.println("Available attempts remaining " + (5-retries));
            }
        }
        if(retries == 5){
            System.out.println("Error");
        }
    }
}


/*Q4.Modify program in Q3 to throw a custom exception if max retries are reached.*/
import java.util.Scanner;

class MaxRetriesException extends Exception{
    public MaxRetriesException(String message){
        super(message);
    }
}

class practiceset14{
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        int retries = 0;
        Scanner sc = new Scanner(System.in);
        while(retries < 5){
            try{
                System.out.println("Enter the index ");
                int index = sc.nextInt();
                System.out.println("Element = " + arr[index]);
                break;//Exit loop
            }
            catch(ArrayIndexOutOfBoundsException e){
                retries++;
                System.out.println("Available attempts remaining " + (5-retries));
            }
        }
        try{
            if(retries == 5){
                throw new MaxRetriesException("Maximum retries reached");
            }
        }
        catch(MaxRetriesException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}

/*WAP in Q3 inside a method which throws your custom exception.*/
import java.util.Scanner;

class MaxRetriesException extends Exception{
    public MaxRetriesException(String message){
        super(message);
    }
}

class practiceset14{
    static void checkretries(int retries) throws MaxRetriesException{
        if(retries >= 5){
            throw new MaxRetriesException("Maximum retries reached!");
        }
    }
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        int retries = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter the index ");
                int index = sc.nextInt();
                System.out.println("Element = " + arr[index]);
                break;//Exit loop
            }
            catch(ArrayIndexOutOfBoundsException e){
                retries++;
                System.out.println("Available attempts remaining " + (5-retries));
            }
        
        try{
            checkretries(retries);
        }
        catch(MaxRetriesException e){
            System.out.println("Error " + e.getMessage());
            break;}
        }
    }
}