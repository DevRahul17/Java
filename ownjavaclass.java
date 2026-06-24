/*-------Object Oriented Creating Own Java Class ------------------------*/
class employee{
    int id;
    String name;
}
class ownjavaclass{
    public static void main(String[] args){
        System.out.println("This is custom class");
        employee a = new employee();//Instantiating a new employee object
        //Setting Attributes

        a.id = 17;
        a.name = "Rahul";
        System.out.println(a.id);
        System.out.println(a.name);
    }
}

/*We can also do it by creating methods inside class.*/
class employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}

class ownjavaclass{
    public static void main(String[] args){
        employee a = new employee();//creating object a
        employee b = new employee();//creating object b
        a.id = 17;
        a.name = "Rahul";
        a.salary = 990000;
        b.id = 18;
        b.name = "Shagun";
        b.salary = 340000;
        //Method Calling
        a.printdetails();
        b.printdetails();
    }
}