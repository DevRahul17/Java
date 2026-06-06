/*----------------Length of an array-------------------*/
class foreach{
    public static void main(String[] args){
        int [] marks = {100,99,98,97,96};
        System.out.println(marks.length);//.length is used to find length of an array
    }
}

/*Q.WAP to print the elements of an array using .length.*/
class foreach{
    public static void main(String[] args){
        int [] marks = {100,99,98,97,96};
        for(int i = 0;i < marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}

/*Q.WAP to print the elements of an array reverse using .length.*/
class foreach{
    public static void main(String[] args){
        int [] marks = {100,99,98,96,95};
        for(int i = marks.length-1;i >= 0;i--){
            System.out.println(marks[i]);
        }
    }
}

/*-------------------For each--------------------------------*/
class foreach{
    public static void main(String[] args){
        int [] marks = {100,99,98,96,95};
        for(int element: marks){//Syntax for(int element: arrayname){}
            System.out.println(element);
        }
    }
}
