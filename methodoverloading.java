class methodoverloading{
    static void methodgreet(){
        System.out.println("Naamaste!");
    }
    public static void main(String[] args){
        methodgreet();
    }
}

/*Q.Sum using object created in java.*/
class methodoverloading{
    int sum(int x , int y){
        return x + y;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c;
        methodoverloading obj = new methodoverloading();
        c = obj.sum(a , b);
        System.out.println(c);
    }
}
class methodoverloading{
    static void change1(int a){
        a = 9;
    }
    static void change2(int [] arr){
        arr[0] = 9;
    }
    public static void main(String[] args){
        int [] arr = {2,4,6,8,10};
        //Case 1: Changing the integer
        int x = 45;
        change1(x);
        System.out.println(x);Here it can not change to 9

        //Case 2: Changing element of an array
        change2(arr);
        System.out.println(arr[0]);//It changes because in array reference is passed
    }
}

/*--------Method Overloading -------------------*/
/*Two or more methods having same name but different parameters*/
class methodoverloading{
    static void greet(){
        System.out.println("Namaste!");
    }
    static void greet(int a){
        System.out.println("Namste " + a + " times");
    }
    public static void main(String[] args){
        greet();
        greet(7);
    }
}



