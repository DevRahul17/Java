/*------Create a thread by extending thread class---------------------------*/
class mythread1 extends Thread{
    public void cook(){
        int i = 0;
        while(i < 5){
            System.out.println("Cooking!");
            i++;
        }
    }
}

class mythread2 extends Thread{
    public void chat(){
        int i = 0;
        while(i < 5){
            System.out.println("Chatting with her!");
            i++;
        }
    }
}

public class threadextendingclass{
        public static void main(String[] args){
            mythread1 a = new mythread1();
            mythread2 b = new mythread2();
            a.start();//Extending thread so run without one method after another as one method can't make it complete one time
            b.start();
            a.cook();
            b.chat();
        }
}

