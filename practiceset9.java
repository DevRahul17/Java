/*Q1.Create a class cylinder and use getters and setters to set its radius and height.*/
class cylinder{
    private int radius;
    private int height;

    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;
    }
}

class practiceset9{
    public static void main(String[] args){
        cylinder a = new cylinder();
        a.setradius(5);
        System.out.println("Radius = " + a.getradius());
        a.setheight(10);
        System.out.println("Height = " + a.getheight());
    }
}

/*Q2.Use Q1 to calculate surface area and volume of a cylinder.*/
class cylinder{
    private int radius;
    private int height;

    public int getradius(){
        return radius;
    }
    public void area(){
        int resultarea = 2 * 3 *radius * height + 2 * 3 * radius * radius;
        System.out.println("Area = " + resultarea);
    }
    public void volume(){
        int resultvolume = 3 * radius * radius * height;
        System.out.println("Volume = " + resultvolume);
    }
    public void setradius(int radius){
        this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;
    }
}

class practiceset9{
    public static void main(String[] args){
        cylinder a = new cylinder();
        a.setradius(5);
        System.out.println("Radius = " + a.getradius());
        a.setheight(10);
        System.out.println("Height = " + a.getheight());
        a.area();
        a.volume();
    }
}

/*Q3.Repeat Q1 with constructor.*/
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius,int height){//Creating Constructor
        this.radius = radius;
        this.height = height;
        System.out.println("Radius = " + this.radius);
        System.out.println("Height = " + this.height);
    }
}

class practiceset9{
    public static void main(String[] args){
        cylinder a = new cylinder(3,6);//Creating Object and calling
    }
}

/*Q4.Overload a constructor used to initialize of rectangle of length 4 and beadth 5 for using custom parameters.*/
class rectangle{
    private int length;
    private int breadth;

    public rectangle(int length,int breadth){//Constructor 1
        this.length = length;
        this.breadth = breadth;
    }
    public rectangle(int length){//Constructor 2
        this.length = length;
        this.breadth = 6;
    }
    public rectangle(){//Constructor 3
        this.length = 8;
        this.breadth = 9;
    }
    public void print(){
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
    }
}
class practiceset9{
    public static void main(String[] args){
        rectangle a = new rectangle(3,4);//Creating Object for Constructor 1
        rectangle a1 = new rectangle(5);//Creating Object for Constructor 2
        rectangle a2 = new rectangle();//Creating Object for Constructor 3

        System.out.println("Rectangle a : ");
        a.print();
        System.out.println("Rectangle a1 : ");
        a1.print();
        System.out.println("Rectangle a2 : ");
        a2.print();
    }
}

/*Q5.Repeat Q1 for spehere.*/
class sphere{
    private float radius;

    public sphere(float radius){//Constructor
        this.radius = radius;
    }
    public void area(){//Creating Method
        float resultarea = 4 * 3.14f * radius * radius;
        System.out.println("Area = " + resultarea);
    }
    public void volume(){//Creating Method
        float resultvolume = (4/3.0f) * 3.14f * radius * radius * radius;
        System.out.println("Volume = " + resultvolume);
    }
}

class practiceset9{
    public static void main(String[] args){
        sphere a = new sphere(3.0f);//Creating Object
        a.area();
        a.volume();
    }
}

