class finallyblock{
    public static int print(){
        try{
            int a = 50;
            int b = 0;//0 for exception
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning resources and program ends here.");
        }
        return 0;
    }
    public static void main(String[] args){
        int x = print();
        System.out.println(x);
    }
}