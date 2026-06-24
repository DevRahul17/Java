/*-----------------Inheritance-------------------*/
/*Inheritance is udes to borrow properties and methods from an existing class.It can be declared using extend keywords.*/
public class dog extends animal{
    //Code
}
class base{//It is also known as superclass
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("I am setting x!");
        this.x = x;
    }
    public void print(){
        System.out.println("I am a Constructor of base class!");
    }
}

class derived extends base{//Inheritance from base class and present all base class things in derived class
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        System.out.println("I am setting y!");
        this.y = y;
    }
    public void print(){
        System.out.println("I am a Constructor of derived class!");
    }
}

class inheritance{
    public static void main(String[] args){
        base a = new base();//Creating base class object
        a.setx(4);
        System.out.println(a.getx());
        a.print();
    }
}

/*Q.Create a class animal and derive another class dog from it.*/
class animal{
    public void eat(){
        System.out.println("Eating!");
    }
    public void run(){
        System.out.println("Running!");
    }
}

class dog extends animal{
    public void bark(){
        System.out.println("Barking!");
    }
}

class inheritance{
    public static void main(String[] args){
        animal a = new animal();//Creating Object for animal class
        a.eat();
        a.run();

        dog a1 = new dog();//Creating Object for dog class
        a1.bark();
    }
}