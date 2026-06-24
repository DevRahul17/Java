/*-----------Break And Continue---------------------*/
class breakcon{
    public static void main(String[] args){
        for(int i = 0;i <= 10;i++){
            System.out.println(i);
            if(i == 7){
                break;//It break it at called place and goes out of loop
            }
        }
    }
}

class breakcon{
    public static void main(String[] args){
        for(int i = 0;i <= 10;i++){
            System.out.println("Continue");
            if(i == 7){
                continue;//It skip at called place and goes to next state
            }
            System.out.println(i);
        }
    }
}