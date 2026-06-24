/*-------Creating thread by runnable interface--------------------------------*/
class thread1 implements Runnable{
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println("I am thread1 by runnable interface");
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println("I am thread2 by runnable interface");
        }
    }
}

class threadrunnableinterface{
    public static void main(String[] args){
        thread1 bullet1 = new thread1();//Creating Object
        Thread gun1 = new Thread(bullet1);//We use it in runnable interface

        thread2 bullet2 = new thread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}