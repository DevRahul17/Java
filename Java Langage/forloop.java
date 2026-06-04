/*------------------For Loop-----------------------*/
class forloop{
    public static void main(String[] args){
            for(int i = 0;i < 7;i++){
                System.out.println(i);
            }
    }
}

/*Q.WAP to print odd numbers upto 100.*/
class forloop{
    public static void main(String[] args){
        for(int i = 0;i < 100;i++){
            if(i % 2 == 0){
                System.out.println(i+1);//For odd we write 2*i+1 and for even we write 2*i
            }
        }
    }
}

/*--------------------Decrement -------------------------*/
class forloop{
    public static void main(String[] args){
            for(int i = 7;i > 0;i--){//We can write also i != 0
                System.out.println(i);
            }
    }
}

/*Q.WAP to reverse natural numbers from 100 using decrement.*/
class forloop{
    public static void main(String[] args){
        for(int i = 100;i != 0;i--){
            System.out.println(i);
        }
    }
}