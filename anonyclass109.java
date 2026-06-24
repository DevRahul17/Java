/*An anonymous class in Java is a class without a name that is declared and instantiated in a single expression.
It's often used when you need a one-time implementation of an interface or subclass.
Greeting is an interface.
Instead of creating a separate class like class MyGreeting implements Greeting, we create the implementation directly.*/
interface greeting{
    void greet();
}

public class anonyclass109{
    public static void main(String[] args){
        greeting a = new greeting(){//Creating object
            @Override
            public void greet(){
                System.out.println("Good Morning using Anonymous Class!");
            }
        };
        a.greet();
    }
}

/*A lambda expression is a shorter way to implement a functional interface (an interface with exactly one abstract method).*/
interface greeting{
    void greet();
}

class anonyclass109{//Lamda Expression
    public static void main(String[] args){
        greeting g = ()-> {//Syntax Of Lambda Expression
            System.out.println("Good Night using Lambda Expression!");
        };
        g.greet();
    }
}