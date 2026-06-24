/*Q1.WAP to to print pattern:
****
***
**
*.*/

class practiceset5{
    public static void main(String[] args){
        int n = 4;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

/*Q2.WAP to sum first n even numbers using while loop.*/
class practiceset5{
    public static void main(String[] args){
        int n = 5;
        int sum = 0;
        int i = 0;
        while(i!=5){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("The sum is : " + sum);
    }
}

/*Q3.WAP to print multiplication table of a given number n.*/
class practiceset5{
    public static void main(String[] args){
        int n = 7;
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}

/*Q4.WAP to print multiplication table in a reverse order.*/
class practiceset5{
    public static void main(String[] args){
        int n = 7;
        for(int i=10;i>=1;i--){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}

/*Q5.WAP to find a factorial of a given number using for loop.*/
class practiceset5{
    public static void main(String[] args){
        int n = 5;
        int fact = 1;
        for(int i=1;i<=5;i++){
            fact = fact*i;
        }
        System.out.printf("Factorial of %d is %d",n,fact);
    }
}

/*Q6.WAP to find a factorial of a given number using while loop.*/
class practiceset5{
    public static void main(String[] args){
        int n = 5;
        int fact = 1;
        int i = 1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.printf("Factorial of %d is %d",n,fact);
    }
}

/*Q7.Repeat Q1 using while loop.*/

/*Q8.WAP to sum the result of table 4.*/
class practiceset5{
    public static void main(String[] args){
        int n = 4;
        int sum = 0;
        for(int i=1;i<11;i++){
            sum = sum + n*i;
        }
        System.out.println(sum);
    }
}