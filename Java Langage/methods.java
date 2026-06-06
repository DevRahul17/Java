/*--------------Methods In Java --------------*/
class methods{
    static int logic(int x , int y){//Method Syntax
    //int logic(int x , int y){//Method Syntax when not write static
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c;
        //Method innovation using object creation
        //methods object = new methods();
        //c = object.logic(a , b);//Method Calling when not putting static and by object creation
        
        c = logic(a , b);//Method Calling
        System.out.println(c);
    }
}