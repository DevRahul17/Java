/*-----------------------Array---------------*/
class array{
    public static void main(String[] args){
        int [] marks = new int[5];//Syntax of array and memory alocation
        marks[0] = 100;
        marks[1] = 99;
        marks[2] = 98;
        marks[3] = 97;
        marks[4] = 96;
        System.out.println(marks[1]);
    }
}

class array{
    public static void main(String[] args){
        int [] marks = {100,99,98,97,96};//Another syntax of array and memory allocation
        for(int i = 0;i < 5;i++){
            System.out.println(marks[i]);
        }
    }
}