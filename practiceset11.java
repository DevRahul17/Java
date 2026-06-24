/*Q1.Create an abstract class pen with methods write() and refill() as abstract methods.*/
/*Q2.Use the pen class from Q1 to create a concrete class fountainpen() with additional method changenib().*/
abstract class pen{
    abstract void write();//we need to define abstract here
    abstract void refill();
}

class fountainpen extends pen{
    void write(){
        System.out.println("Writing!");
    }
    void refill(){
        System.out.println("Refilling!");
    }
    void changenib(){
        System.out.println("Changing a nib!");
    }
}

class practiceset11{
    public static void main(String[] args){
        fountainpen a = new fountainpen();//Creating Object
        a.write();
        a.refill();
        a.changenib();
    }
}

/*Q3.Create a class monkey with jump() and bite() methods.Create a class human which inherits this monkey class and implements this basicanimal
interface with eat() and sleep() methods.*/
class monkey{
    void jump(){
        System.out.println("Jumping!");
    }
    void bite(){
        System.out.println("Biting!");
    }
}

interface basicanimal{
    void eat();
    void sleep();
}

class human extends monkey implements basicanimal{//Using inheritance here and implements basicanimal
    void run(){
        System.out.println("Running!");
    }
    public void eat(){//We need to make body here of interface methods and add public
        System.out.println("Eating!");
    }
    public void sleep(){
        System.out.println("Sleeping!");
    }
}

class practiceset11{
    public static void main(String[] args){
        human h = new human();//Creating Object
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
    }
}

/*Q4.Create a class telephone with ring(),lift() and disconnect() methods as abstract methods.Create another class smarttelephone and demonstrate polymorphism.*/
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smarttelephone extends telephone{
    void ring(){
        System.out.println("Ringing!");
    }
    void lift(){
        System.out.println("Lifting!");
    }
    void disconnect(){
        System.out.println("Disconnecting!");
    }
    void greet(){
        System.out.println("Good morning!");
    }
    void bye(){
        System.out.println("Say byee!");
    }
}

class practiceset11{
    public static void main(String[] args){
        telephone a = new smarttelephone();//Creating Object

        a.ring();
        a.lift();
        a.disconnect();
        //a.greet();Not allowed
        //a.bye();Not allowed
    }
}

/*Q5.Use Polymorphism in Q3.*/
class monkey{
    void jump(){
        System.out.println("Jumping!");
    }
    void bite(){
        System.out.println("Biting!");
    }
}

interface basicanimal{
    void eat();
    void sleep();
}

class human extends monkey implements basicanimal{//Using inheritance here and implements basicanimal
    void run(){
        System.out.println("Running!");
    }
    public void eat(){//We need to make body here of interface methods and add public
        System.out.println("Eating!");
    }
    public void sleep(){
        System.out.println("Sleeping!");
    }
}

class practiceset11{
    public static void main(String[] args){
        monkey h = new human();//Creating Object
        h.jump();
        h.bite();
        //h.eat();Not allowed
        //h.sleep();Not allowed
    }
}

/*Q6.Create an interface tvremote and use it to inherit another interface smarttvremote.*/
interface tvremote{
    void remote();
    void changechannel();
}

interface smarttvremote extends tvremote{
    void watch();
    void off();
}

class smartwork implements smarttvremote{
    public void remote(){
        System.out.println("Remoting!");
    }
    public void changechannel(){
        System.out.println("Changing a channel!");
    }
    public void watch(){
        System.out.println("Watching a TV!");
    }
    public void off(){
        System.out.println("Switch off a TV!");
    }
}

class practiceset11{
    public static void main(String[] args){
        smartwork a = new smartwork();//Creating Object

        a.remote();
        a.changechannel();
        a.watch();
        a.off();
    }
}

