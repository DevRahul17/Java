/* Create a class Game,which allows a user to play "Guess the number"
game once.Game should have the following methods:
1.Constructor to generate the Random number
2.takeuserinput() to take a user input
3.iscorrectnumber() to detect whether the number entered by the user is true
4.getter and setter for noofguesses
Use properties such as noofguesses(int),etc to get this task done!*/

import java.util.Random;
import java.util.Scanner;


class game{
    private int noofguesses;
    private int randomnum;
    private int usernumber;
    
    //Constructor to generate a random number
    public game(){
        Random r = new Random();
        randomnum = r.nextInt(100);
        noofguesses = 0;
    }

    //Method to take user input
    public void takeuserinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        usernumber = sc.nextInt();
        noofguesses++;
    }

    //Method to check if guess number is correct
    public boolean iscorrectnumber(){
        if(usernumber == randomnum){
            System.out.println("You guess it right !");
            System.out.println("You guess it in " + noofguesses + " attempts");
            return true;
        }
        else if(usernumber > randomnum){
            System.out.println("Your guess is wrong as it is higher!");
        }
        else{
            System.out.println("Your guess is wrong as it is lower!");
        }
        return false;
    }

    //Getter for noofguesses
    public int getnoofguesses(){
        return noofguesses;
    }

    //Set for noofguesses
    public void setnoofguesses(){
        this.noofguesses = noofguesses;
    }
}

class exercise3{
    public static void main(String[] args){
        game g = new game();
        boolean guessed = false;

        while(!guessed){
            g.takeuserinput();
            guessed = g.iscorrectnumber();
        }
    }
}