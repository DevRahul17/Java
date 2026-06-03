/*-----------Increment/Decrement Operators------------------*/
class inc_dec{
    public static void main(String[] args){
        int i = 56;
        // int b = i++;Here i remain same in i++ as 56 and first it used than incrementedand in ++i it increment first and then use
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int j = 17;//Same in Decrement Operator
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);
        System.out.println(j);

        int a = 7;
        System.out.println(++a*7);

        char ch = 'B';
        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println(ch);
        System.out.println(--ch);
        System.out.println(ch);
    }
}
