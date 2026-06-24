/*--------Inheritance in interface----------------------------------------*/

interface parent{
    void method1();
    void method2();
}

//Extending interface using inheritance
interface child extends parent{
    void method3();
    void method4();
}

class methods implements child{//We need to define all method here
    public void method1(){
        System.out.println("Method 1!");
    }
    public void method2(){
        System.out.println("Method 2!");
    }
    public void method3(){
        System.out.println("Method 3!");
    }
    public void method4(){
        System.out.println("Method 4!");
    }
}

class inheritanceininterface{
    public static void main(String[] args){
        methods a = new methods();//Creating Object
        a.method1();
        a.method2();
        a.method3();
        a.method4();
    }
}