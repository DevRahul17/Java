/*Errors - 1.Syntax error 2.Logical error 3.Runtime error*/
/*1.Syntax error*/
class errorsexception{
    public static void main(String[] args){
        int a = 5//Syntax error
        System.out.prntln(a);
    }
}

/*2.Logical error*/
class errorsexception{
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int area = 2*(a + b);//area = l * b Logical Error
        System.out.println("Area = " + area);
    }
}

/*3.Runtime error*/
class errorsexception{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int result = a/b;//Runtime error
        System.out.println(result);//b = 0
    }
}