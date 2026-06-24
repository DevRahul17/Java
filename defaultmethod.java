interface mycamera{
    void takesnap();//In interface we can not make body here

    default void recordvideo(){//Default method in this we make body here in interface
        System.out.println("Recording in 4k!");
    }
}

interface mywifi{
    String[] getnetworks();
    void connecttonetwork(String network);
}

class cellphone{//Inheritance class
    void callnumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting...");
    }
}

class smartphone extends cellphone implements mywifi,mycamera{
    public void takesnap(){//We use public here
        System.out.println("Taking Snap");
    }
    public String[] getnetworks(){
        System.out.println("Getting list of networks");
        String[] networklist = {"Rahul","Shambhavi","Tanishka"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

class defaultmethod{
    public static void main(String[] args){
        smartphone a = new smartphone();//Creating object

        String[] b = a.getnetworks();
        for(int i = 0;i < b.length;i++){
            System.out.println(b[i]);
        }
        //Calling default method from interface
        a.recordvideo();
    }
}
