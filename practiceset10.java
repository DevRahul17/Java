/*Q1.Create a class circle and use inheritance to create another class cylinder from it.*/
class circle{
    public float radius;

    circle(){//Using Constructor
        System.out.println("I am constructor of cicle with no argument");
    } 
    circle(float r){//Using Constructor
        this.radius = r;
        System.out.println("I am constructor of cicle with argument");
    } 
    public float areacircle(){
        float result = 3.14f*this.radius*this.radius;
        System.out.println(result);
        return result;
    }
}

class cylinder extends circle{
    public float height;

    cylinder(float r,float h){//Using Constructor
    super(r);
    this.height = h;
    System.out.println("I am constructor of cylinder with arguments");
    } 
    public float areacylinder(){
        float result1 = 3.14f*this.radius*this.radius*this.height;
        System.out.println(result1);
        return result1;
    }
}

class practiceset10{
    public static void main(String[] args){
        cylinder a = new cylinder(5,7);
        a.areacircle();
        a.areacylinder();
    }
}