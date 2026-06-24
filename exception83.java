import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString(){//tostring() used to return string
        return "Hello Everyone toString()";
    }
    public String getMessage(){
        return "Getting Message getMessage()";
    }
}

class exception83{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int a = sc.nextInt();
        
        if(a<10){
            try{
                throw new myexception();//throw is used to throw exception in a programme and stop there
            }
            catch(Exception e){
                System.out.println(e.toString());//For toString()
                System.out.println(e.getMessage());//For getMessage()
                e.printStackTrace();
            }
        }
    }
}