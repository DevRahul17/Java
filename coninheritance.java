/* Constructor Inheritance */
class base{
    base(){
        System.out.println("I am a constructor of base class");
    }
    base(int a){
        System.out.println("I am a constructor of argument : " + a);
    }
}

class derived extends base{
    derived(){
        System.out.println("I am a constructor of derived class");
    }
}

class coninheritance{
    public static void main(String[] args){
        base a = new base();//It runs constructor of base class
        derived a1 = new derived();//It runs constructor of base class and derived class
    }
}

/*Here super runs the argument class*/
class base{
    base(){
        System.out.println("I am a constructor of base class");
    }
    base(int a){
        System.out.println("I am a constructor of argument : " + a);
    }
}

class derived extends base{
    derived(){
        super(4);//It can run the argument base class
        System.out.println("I am a constructor of derived class");
    }
}

class coninheritance{
    public static void main(String[] args){
        //base a = new base();//It runs constructor of base class
        derived a1 = new derived();//It runs constructor of base class and derived class
    }
}

/*Here we take two arguments */

class base{
    base(){
        System.out.println("I am a constructor of base class");
    }
    base(int x){
        System.out.println("I am a constructor of argument : " + x);
    }
}

class derived extends base{
    derived(){
        System.out.println("I am a constructor of derived class");
    }
    derived(int x,int y){
        super(x);//It can run the argument base class
        System.out.println("I am a constructor of derived class with argument y " + y);
    }
}


class coninheritance{
    public static void main(String[] args){
        //base a = new base();//It runs constructor of base class
        //derived a1 = new derived();//It runs constructor of base class and derived class
        derived a2 = new derived(5,7);
    }
}