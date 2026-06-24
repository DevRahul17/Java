import java.util.ArrayDeque;

class arraydeque{
    public static void main(String[] args){
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.addFirst(4);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}