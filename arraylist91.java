import java.util.*;

class arraylist91{
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();//Creating Object
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(/*index*/ 5,/*element*/ 6);//For adding element at particular index
        // for(int i = 0;i < l.size();i++){
        //     System.out.println(l.get(i));//For accesing array index we use get()
        // }
        l.add(6,6);
        System.out.println(l.contains(5));//It returns true if an arraylist have given element else false
        System.out.println(l.indexOf(5));//It return element that present on a given index in an arraylist 
        System.out.println(l.lastIndexOf(5));//It return element that present on a given last index in an arraylist 
    }
}

