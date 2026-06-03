/*------------If-Else---------------------------*/
class ifelse{
    public static void main(String[] args){
        int age = 19;
        
        if(age>=18){
            System.out.println("You can Vote!");
        }
        else{
            System.out.println("You can not vote!");
        }
    }
}

/*We can also do it by boolean*/
class ifelse{
    public static void main(String[] args){
        int age = 19;
        boolean condition = (age>=18);
        if(condition){
            System.out.println("You can vote!");
        }
        else{
            System.out.println("You can not vote!");
        }
    }
}
