/*You have to create a custom calculator with the following operations:
-Addition -Subtrcation -Multiplication -Division
which throws the following exception-
1.Invalid input exception
2.Cannot divide by 0 Exception
3.Max Input Exception if any of the inputs is greater than 1000
4.Max Multiplier Reached Exception -Don't allow any multiplication input to be greater
 than 7000.*/
//Exception class
class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}

class CannotDivideByZeroException extends Exception{
    public CannotDivideByZeroException(String message){
        super(message);
    }
}

class MaxInputException extends Exception{
    public MaxInputException(String message){
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception{
    public MaxMultiplierReachedException(String message){
        super(message);
    }
}

//Calculator class
class calculator{
    private void validateinput(double a,double b) throws MaxInputException{
        if(a > 1000 || b > 1000){
            throw new MaxInputException("Maximum input is reached.You cannot input more than 1000");
        }
    }
    public double add(double a,double b) throws MaxInputException{
        validateinput(a,b);
        return a+b;
    }
    public double subtract(double a,double b) throws MaxInputException{
        validateinput(a,b);
        return a-b;
    }
    public double multiply(double a,double b) throws MaxInputException,MaxMultiplierReachedException{
        validateinput(a,b);

        if(a > 7000 || b > 7000){
            throw new MaxMultiplierReachedException("Maximum multiplier reached exception");
        }
        return a*b;
    }
    public double divide(double a,double b) throws MaxInputException,CannotDivideByZeroException{
        validateinput(a,b);

        if(b == 0){
        throw new CannotDivideByZeroException("Cannot divide by 0 exception");
        }
        return a/b;
    }
}

class exercise6{
    public static void main(String[] args){
        calculator c = new calculator();//Creating Object

        try{
            System.out.println("Addition:" + c.add(50,100));
            System.out.println("Subtracion:" + c.subtract(60,30));
            System.out.println("Multiplication:" + c.multiply(11,5));
            System.out.println("Division:" + c.divide(300,10));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}