/*----------Variable Arguments-----------------------*/
class varargs{
    static int sum(int ...arr){//Syntax of variable arguments
        //It take it as an int
        int result = 0;
        for(int element:arr){
            result = result + element;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Sum " + sum());
        System.out.println("Sum " + sum(2,3));
        System.out.println("Sum " + sum(2,3,4));
        System.out.println("Sum " + sum(2,3,4,5));
    }
}

/*When we want one argument must be present that is x.*/
class varargs{
    static int sum(int x,int ...arr){//Syntax of variable arguments
        //It take it as an int
        int result = x;
        for(int element:arr){
            result = result + element;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Sum " + sum(2,3));
        System.out.println("Sum " + sum(2,3,4));
        System.out.println("Sum " + sum(2,3,4,5));
    }
}