/*-----Create a File----------------*/
import java.io.File;
import java.io.IOException;

class filehandling{
    public static void main(String[] args){
        try{
            File file = new File("sample.txt");
            if(file.createNewFile()){
                System.out.println("File created successfully!");
            }
            else{
                System.out.println("File already exists!");
            }
        }
        catch(IOException e){
            System.out.println("Error in creating file!");
        }
    }
}

/*-----Write a File----------------*/
import java.io.FileWriter;
import java.io.IOException;

class filehandling{
    public static void main(String[] args){
        try{
            FileWriter w = new FileWriter("sample.txt");

            w.write("Hello i am writing a file!");
            w.close();
            System.out.println("Data written successfully!");
        }
        catch(IOException e){
            System.out.println("Error in writing a file!");
        }
    }
}

/*-----Read a File----------------*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class filehandling{
    public static void main(String[] args){
        try{
            File f = new File("sample.txt");
            Scanner sc = new Scanner(f);

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}

/* Creating a file for deleting name dltfile.txt.*/
import java.io.File;
import java.io.IOException;

class filehandling{
    public static void main(String[] args){
        try{
            File f = new File("dltfile.txt");
            if(f.createNewFile()){
                System.out.println("File has been created!");
            }
            else{
                System.out.println("File already exists!");
            }
        }
        catch(IOException e){
            System.out.println("Error in creating file!");
        }
    }
}

/*----Delete a File---------------------------*/
import java.io.File;

public class filehandling{
    public static void main(String[] args){
        File f = new File("dltfile.txt");

        if(f.delete()){
            System.out.println("File deleted successfully!");
        }
        else{
            System.out.println("Failed to delete a file!");
        }
    }
}