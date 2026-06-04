/*------------Rock,Paper And Scisssor------------------------------*/
import java.util.Random;
import java.util.Scanner;

class exercise2{
    public static void main(String[] args){
        //0 for rock 
        //1 for paper
        //2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper and 2 for scissor:");
        int userinput = sc.nextInt();

        Random random = new Random();//For computer random input choice
        int computerinput = random.nextInt(3);

        if(userinput == computerinput){
            System.out.println("Draw!");
        } 
        else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1){
            System.out.println("You Won!");
        }
        else{
            System.out.println("Computer Won!");
        }
        if(computerinput == 0){
            System.out.println("Computer Input is Rock");
        }
        else if(computerinput == 1){
            System.out.println("Computer Input is Paper");
        }
        else{
            System.out.println("Computer Input is Scissor");
        }
    }
}