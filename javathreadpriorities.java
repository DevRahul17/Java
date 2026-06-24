class mythread1 extends Thread{
    public mythread1(String name){
        super(name);
    }
    public void run(){
        for(int i = 0;i < 5;i++){
            System.out.println("This is " + this.getName());
        }
    }
}

class javathreadpriorities{
    public static void main(String[] args){
        mythread1 a = new mythread1("Rahul");//Maximum priority in thread
        mythread1 b = new mythread1("Shanaya");
        mythread1 c = new mythread1("John");
        mythread1 d = new mythread1("Sahil");
        mythread1 e = new mythread1("Varun");//Minimum priority in thread
        a.setPriority(Thread.MAX_PRIORITY);
        e.setPriority(Thread.MIN_PRIORITY);

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}