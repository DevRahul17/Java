/*Q1.WAP in java which one thread print good morning and another thread print good night.*/
class gmwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Morning!");
        }
    }
}

class gnwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Night!");
        }
    }
}

class practiceset13{
    public static void main(String[] args){
        gmwish a = new gmwish();
        gnwish b = new gnwish();

        a.start();
        b.start();
    }
}

/*Q2.Add a sleep method in gn thread of question 1 to delay its execution 
for 200 ms.*/
class gmwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Morning!");
        }
    }
}

class gnwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            try{
                Thread.sleep(200);//For 200 milliseconds
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good Night!");
        }
    }
}

class practiceset13{
    public static void main(String[] args){
        gmwish a = new gmwish();
        gnwish b = new gnwish();

        a.start();
        b.start();
    }
}

/*Q3.Demonstrate getPriority() and setPriority() methods in java threads.*/
class gmwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Morning!");
        }
    }
}

class gnwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Night!");
        }
    }
}

class practiceset13{
    public static void main(String[] args){
        gmwish a = new gmwish();
        gnwish b = new gnwish();
        a.setPriority(5);
        b.setPriority(7);
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        a.start();
        b.start();
    }
}

/*Q4.How do you get state of a given thread in java.*/
class gmwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Morning!");
        }
    }
}

class gnwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Night!");
        }
    }
}

class practiceset13{
    public static void main(String[] args){
        gmwish a = new gmwish();
        gnwish b = new gnwish();
        a.setPriority(5);
        b.setPriority(7);
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        System.out.println(b.getState());
        a.start();
        b.start();//If we not start this so state is runnable
    }
}

/*Q5.How do you get reference to the current thread.*/
class gmwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Morning!");
        }
    }
}

class gnwish extends Thread{
    public void run(){
        for(int i = 0;i < 7;i++){
            System.out.println("Good Night!");
        }
    }
}

class practiceset13{
    public static void main(String[] args){
        gmwish a = new gmwish();
        gnwish b = new gnwish();
        a.setPriority(5);
        b.setPriority(7);
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        System.out.println(Thread.currentThread().getState());
        a.start();
        b.start();
    }
}
