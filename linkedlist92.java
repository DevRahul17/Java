import java.util.*;

class linkedlist92{
    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        for(int i = 0;i < l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println(l.contains(2)); 
        System.out.println(l.indexOf(2)); 
        System.out.println(l.lastIndexOf(2)); 
        
    }
}