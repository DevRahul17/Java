/*Commonly used constructor Thread(),Thread(String name),Thread(Runnable r) and Thread(Runnable r,String name).*/
class mythread extends Thread{
    public mythread(String name){//Made constructor here
        super(name);
    }
    public void run(){
        for(int i = 0;i < 5;i++){
            System.out.println("I am a Thread!");
        }
    }
}

class constructorthread{
    public static void main(String[] args){
        mythread a = new mythread("Rahul");
        mythread b = new mythread("Alia");
        a.start();
        b.start();
        System.out.println("The id of thread is " + a.getId());//Method for get id of thread
        System.out.println("The name of thread is " + a.getName());//Method for get name for thread
        System.out.println("The id of thread is " + b.getId());//Method for get id of thread
        System.out.println("The name of thread is " + b.getName());//Method for get name for thread
    }
}

/*Using Thread(Runnable r,String name).*/
class Myrunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 0;i < 5;i++){
            System.out.println(Thread.currentThread().getName() + " is running!");
        }
    }
}

class constructorthread{
    public static void main(String[] args){
        Myrunnable task1 = new Myrunnable();
        Myrunnable task2 = new Myrunnable();

        Thread a = new Thread(task1,"Rahul");
        Thread b = new Thread(task2,"Alia");

        a.start();
        b.start();

        System.out.println("The id of a thread is " + a.getId());
        System.out.println("The name of a thread is " + a.getName());

        System.out.println("The id of a thread is " + b.getId());
        System.out.println("The name of a thread is " + b.getName());
    }
}