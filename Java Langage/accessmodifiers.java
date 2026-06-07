/*--------------Access Modifiers------------------------------*/
class employee{
    private int id;
    private String name;//private is a access modifier and access by getters and setters
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setid(int x){
        id = x;
    }
    public int getid(){
        return id;
    }
}

class accessmodifiers{
    public static void main(String[] args){
        employee a = new employee();//Creating Object

        a.setname("Rahul");
        a.setid(17);
        System.out.println(a.getname());
        System.out.println(a.getid());
    }
}

/*Use access modifiers for circle.*/
class circle{
    private float radius;
    private float area;
    private float perimeter;

    public void setradius(float r){
        radius = r;
    }
    public float getarea(){
        area = 3.14f * radius * radius;
        return area ;
    }
    public float getperimeter(){
        perimeter = 2 * 3.14f * radius;
        return perimeter;
    }
}

class accessmodifiers{
    public static void main(String[] args){
        circle c = new circle();//Creating Object
        c.setradius(3.0f);

        System.out.println("Area of a circle is " + c.getarea());
        System.out.println("Perimeter of a circle is " + c.getperimeter());
    }
}