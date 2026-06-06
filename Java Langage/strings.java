import java.util.Scanner;
class strings{
    public static void main(String[] args){
        String name = new String("Rahul");//Syntax of String
        String method2name = "Harry";//Another Syntax of string
        System.out.println(name);
        System.out.println(method2name);

        int a = 5;
        float b = 6.75727f;
        System.out.printf("The value of a is %d and the value of b is %f",a,b);
        System.out.format("The value of a is %d and the value of b is %f",a,b);//Same Syntax
        Scanner sc = new Scanner(System.in);
        //String st = sc.next();//For not white Space
        String st = sc.nextLine();//For white space
        System.out.println(st);
    }
}
