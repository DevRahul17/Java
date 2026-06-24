interface bicycle{
    int x = 5;
    void applybrake(int decrement);
    void applyspeed(int increment);
}

class atlas implements bicycle{
    void blowhorn(){
        System.out.println("Horn!");
    }
    public void applybrake(int decrement){//We need public in interface method
    System.out.println("Applying brake!");
    }
    public void applyspeed(int increment){//We need public in interface method
    System.out.println("Applying Speedup!");
    }
}

class abstractvsinterface{
    public static void main(String[] args){
        atlas a = new atlas();//Creating Object
        a.blowhorn();
        a.applybrake(5);
        a.applyspeed(10);

        System.out.println("The value of x is " + a.x);
    }
}