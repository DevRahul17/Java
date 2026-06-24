/*Q1.Create a class employee with the following properties and methods:
salary(property)(int)
getsalary(method returning int)
name(property)(string)
getname(method returning string)
setname(method changing name).*/
class employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}

class practiceset8{
    public static void main(String[] args){
        employee a = new employee();
        a.setname("Rahul");
        a.salary = 999999;
        System.out.println(a.getsalary());
        System.out.println(a.getname());
    }
}

/*Q2.Create a class cellphone with methods to print ringing,vibrating etc.*/
class cellphone{
    public void ringing(){
        System.out.println("Ringing!");
    }
    public void vibrating(){
        System.out.println("Vibrating!");
    }
    public void calling(){
        System.out.println("Calling!");
    }
}

class practiceset8{
    public static void main(String[] args){
        cellphone a = new cellphone();//Creating Object
        a.ringing();
        a.vibrating();
        a.calling();
    }
}

/*Q3.Create a class square with a method to initialize its size,calculating area and perimeter etc.*/
class square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}

class practiceset8{
    public static void main(String[] args){
        square s = new square();//Creating Object
        s.side = 4;
        System.out.println("Area of a square is " + s.area());
        System.out.println("Perimeter of a square is " + s.perimeter());
    }
}

/*Q4.Create a class rectangle with a method to initialize its length,breadth,calculating area and perimeter etc.*/
class rectangle{
    int length,breadth;
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
}

class practiceset8{
    public static void main(String[] args){
        rectangle a = new rectangle();//Creating Object
        a.length = 2;
        a.breadth = 3;
        System.out.println("Area of a rectangle is " + a.area());
        System.out.println("Perimeter of a rectangle is " + a.perimeter());
    }
}

/*Q5.Create a class tommyvercetti for Rockstar Games for print Hitting,Running and Firing etc.*/
class tommyvercetti{
    public void hitting(){
        System.out.println("Hitting!");
    }
    public void running(){
        System.out.println("Running!");
    }
    public void firing(){
        System.out.println("Firing!");
    }
}

class practiceset8{
    public static void main(String[] args){
        tommyvercetti a = new tommyvercetti();//Creating Object
        a.hitting();
        a.running();
        a.firing();
    }
}

/*Q6.Create a class circle with a method to initialize its radius,calculating area and perimeter etc.*/
class circle{
    float radius;
    public float area(){
        return 3.14f * radius * radius;
    }
    public float perimeter(){
        return 2 * 3.14f * radius;
    }
}

class practiceset8{
    public static void main(String[] args){
        circle a = new circle();//Creating Object
        a.radius = 3.0f;
        System.out.println("Area of a circle is " + a.area());
        System.out.println("Perimeter of a cricle is " + a.perimeter());
    }
}
