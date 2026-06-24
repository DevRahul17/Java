class throwsclass{
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
}

class throwskeyword{
    public static void main(String[] args){
        try{
            int c = throwsclass.divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}

---------------------------------------------------------------------------
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative";
    }
    @Override
    public String getMessage(){
        return "Radius can't be negative";
    }
}
class throwsclass{
    public static double area(double r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double a = 3.14 * r * r;
        return a;
    }
}

class throwskeyword{
    public static void main(String[] args){
        try{
            double b = throwsclass.area(-1);
            System.out.println(b);
        }
        catch(NegativeRadiusException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}