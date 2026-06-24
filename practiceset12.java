/*Q1.Create three classes calculator,sccalculator and hybridcalculator and group them into a package.*/
class calculator{
    public void calculate(int a,int b){
        System.out.println("Your result is " + (a+b));
    }
}

class sccalculator{
    public void sincalculate(int a,int b){
        System.out.println("Your result is " + Math.sin(a+b));
    }
}

class hybridcalculator{
    public void hybridcalculate(int a,int b){
        System.out.println("Your result is " + Math.cos(a+b));
    }
}

class practiceset12{
    public static void main(String[] args){
        calculator c = new calculator();//Creating Object
        sccalculator d = new sccalculator();//Creating Object
        hybridcalculator e = new hybridcalculator();//Creating Object

        c.calculate(5,10);
        d.sincalculate(5,10);
        e.hybridcalculate(5,10);
    }
}