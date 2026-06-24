/*---------------Constructor--------------------------------*/
/*In Constructor,we define Method name is same as of class name.*/
class employee{
    private int id;
    private String name;

    public employee(){//Using Constructor here
        id = 17;
        name = "Rahul";
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
}

class constructor{
    public static void main(String[] args){
        employee a = new employee();//Creating Object
        System.out.println(a.getid());
        System.out.println(a.getname());
    }
}

/*In this we pass name in creating object.*/
class employee{
    private int id;
    private String name;

    public employee(String myname){//Here we pass that name present while creating object in employee
        id = 17;
        name = myname;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
}

class constructor{
    public static void main(String[] args){
        employee a = new employee("Rahul");//Creating Object
        System.out.println(a.getid());
        System.out.println(a.getname());
    }
}

/*Q.Overload the employee constructor to intialize the salary to rupees 10000.*/
class employee{
    String name;
    int salary;

    //Constructor with name and salary parameter
    public employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    //Method Overloading with only name parameter
    public employee(String name){
        this.name = name;
        this.salary = 10000;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Salary in Rupees : " + salary);
    }
}

class constructor{
    public static void main(String[] args){
        employee e1 = new employee("Rahul",9900000);
        employee e2 = new employee("Shagun");
        e1.display();
        e2.display();
    }
}