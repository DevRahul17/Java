/*this keyword is a way for refernece an object of the class */
class value{
    int x;
    public void setvalue(int x){
        this.x = x;
    }
    public int getvalue(){
        return this.x;
    }
}

class thissuper{
    public static void main(String[] args){
        value a = new value();//Creating Object
        a.setvalue(5);
        System.out.println("The value is " + a.getvalue());
    }
}

/*super keyword is used to refer an immediate parent class*/
class animal{
    animal(){
        System.out.println("Lion!");
    }
    animal(int x){
        System.out.println("Tiger!");
    }
}

class dog extends animal{
    dog(){
        System.out.println("Barking!");
    }
    dog(int x,int y){
        super(x);//It is used to print the argumental value
        System.out.println("Barking + Running!");
    }
}
class thissuper{
    public static void main(String[] args){
        dog a = new dog(5,7);//Creating Object
    }
}