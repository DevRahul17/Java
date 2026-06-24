/*Exceptions-Event that occurs when program disrupting normal flow of instructions.
2 Types 1.Checked Exception(Compile Time) 2.Unchecked Exception(Runtime)
Commonly Exception
1.NUll Pointer Exception
2.Arithmetic Exception
3 .ArrayIndex Out of Bound Exception
4.Illegal Argument Exception
5.Number Format Exception.*/

class trycatch{
    public static void main(String[] args){
        int a = 50;
        int b = 0;
        int result = a/b;
        try{
            System.out.println("Result is " + result);
        }
        catch(Exception e){//If any exception use it
            System.out.println("Exception occured!");
            System.out.println(e);
        }
    }
}