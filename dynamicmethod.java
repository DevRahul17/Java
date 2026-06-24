/*-------------------Dynamic Method--------------------------------*/
class phone{
    public void ring(){
        System.out.println("Ringing!");
    }
    public void greet(){
        System.out.println("Good Morning!");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("Music Playing!");
    }
    public void greet(){
        System.out.println("Good Morning!");
    }
}

class dynamicmethod{
    public static void main(String[] args){
        phone a = new smartphone();//Dynamic method
        //smartphone a1 = new phone();Not allowed
        a.ring();
        a.greet();//It runs inside of smartphone because of object a owns smarthone
    }
}