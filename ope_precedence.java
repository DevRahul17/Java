/*--------------Operators And Precednce---------------------------------*/
class ope_precedence{
    public static void main(String[] args){
        int i = 6*5-34/2;
        System.out.println(i);
        /*
        = 30-34/2
        = 30-17
        = 13
        */

       int j = 60/5-34*2;
       System.out.println(j);
       /* Here precednce are same so associativity comes to play in left to right /*
       = 12-34*2
       = 12-68
       = -56
       */
      //Quick Quiz Write Expression
      int x = 10;
      int y = 2;
      int res = x*y/2;
      System.out.println(res);

      int a = 2,b = 4,c = 3;
      int q = (b*b - (4*a*c))/(2*a);
      System.out.println(q);

    }
}

