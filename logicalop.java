/*--------------Logical Operator---------------------*/
/*-------Logical And &&-------------*/
class logicalop{
    public static void main(String[] args){
        boolean a = true;
        boolean b = true;
        System.out.println("For Logical And &&");//Gives true if both are true else false
        if(a && b){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
    }
}

/*-------Logical OR ||-------------*/
class logicalop{
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        System.out.println("For Logical OR ||");//Gives true if any are true
        if(a || b){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
    }
}

/*---------------Logical NOT----------------------*/
class logicalop{
    public static void main(String[] args){
        boolean a = true;
        System.out.println("For NOT !");
        System.out.println(!a);
    }
}