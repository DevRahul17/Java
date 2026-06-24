/*---------------Join--------------------*/
class mythread1 extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("I am thread1");
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("I am thread2");
        }
    }
}

class threadmethod{
    public static void main(String[] args){
        mythread1 a = new mythread1();
        mythread2 b = new mythread2();

        a.start();
        try{
            a.join();//join methos generate exception and it first generate all the a.start() method and stop it after complete and then gies to b method
        }
        catch(Exception e){
            System.out.println(e);
        }
        b.start();
    }
}

/*----------------------------Interrupted------------------------------*/

class mythread1 extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("I am thread 1");
            try{
            Thread.sleep(3);//It stop mythread1 for 3 miliseconds
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class threadmethod{
    public static void main(String[] args){
        mythread1 a = new mythread1();
        mythread2 b = new mythread2();

        a.start();
        b.start();
    }
}