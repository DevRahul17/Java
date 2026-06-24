/*-------------Method Overriding---------------------------------------*/
/*It is when we use parent class method in child class method it is known as method overriding*/
class a{
    public void method1(){
        System.out.println("I am method 1 of Class A");
    }
    public void method2(){
        System.out.println("I am method 2 of Class A");
    }
}

class b extends a{
    @Override//It is used for checkingif the method is not override program gives error
    public void method2(){
        System.out.println("I am method 2 of Class B");
    }
    public void method3(){
        System.out.println("I am method 3 of Class B");
    }
}

class methodoverride{
    public static void main(String[] args){
        a a1 = new a();//Creating Object
        a1.method2();
        b b1 = new b();//Creating Object
        b1.method2();
    }
}