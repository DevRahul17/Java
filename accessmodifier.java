/*----------------------------Acces Modiifiers ----------------------------*/
class access{
    public int a = 5;//public
    protected int b = 6;//protected
    int c = 7;//default
    private int d = 8;private
    public void method(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class accessmodifier{
    public static void main(String[] args){
        access x = new access();//Creating Object
        x.method();
    }
}
/*-----------Class      Package      Subclass        World
-public       Y           Y            Y               N
-protected    Y           Y            Y               Y
-default      Y           Y            N               Y
-private      N           N            N               Y*/