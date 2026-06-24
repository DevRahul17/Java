abstract class parent{
    public parent(){
        System.out.println("I am a constructor of parent class");
    }
    public void greet(){
        System.out.println("Good morning");
    }
    abstract void hello();//abstract method
} 

class child extends parent{
    @Override
    public void hello(){
        System.out.println("Hello");
    }
}

class abstract1{
    public static void main(String[] args){
        child a = new child();
    }
}