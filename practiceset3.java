/*---------------Practice Questions-------------------*/
/*Q1.Write a Java program to convert a string to lowercase.*/
class practiceset3{
    public static void main(String[] args){
        String name = "RAHUL KUMAR";
        name = name.toLowerCase();
        System.out.println(name);
    }
}

/*Q2.Write a java program to replaces spaces with underscores.*/
class practiceset3{
    public static void main(String[] args){
        String text = "Hello welcome to java";
        text = text.replace(" ","_");
        System.out.println(text);
    }
}

/*Q3.Write a java program to fill in a letter template which looks like below:
letter = " Dear <|name|>, Thanks a lot"
Replace <|name|> with a string (Some name).*/
class practiceset3{
    public static void main(String[] args){
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Rahul");
        System.out.println(letter);
    }
}

/*Q4.Write a java program to detect double and triple spaces in a string.*/
class practiceset3{
    public static void main(String[] args){
        String sentence = "Australia won the  2023 Word Cup  under  Pat Cummins  Captaincy";
        System.out.println(sentence.indexOf("  "));//If present gave index value else return -1
        System.out.println(sentence.indexOf("   "));//If present gave index value else return -1
    }
}

/*Q5.Write a program to format the following letter using Esacape Sequence Character.
letter = "Dear harry,this Java Course is nice.Thanks."*/
class practiceset3{
    public static void main(String[] args){
        String letter = "Dear harry,\n\tThis Java Course is nice.\n\tThanks!";
        System.out.println(letter);
    }
}