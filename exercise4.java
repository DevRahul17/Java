/*You have to implement a library using Java Class Library 
Methods: addbook,issuebook,returnbook,availablebooks
Properties: Array to store the available books
Array to store the issued books*/

class library{
    String[] available = new String[10];
    String[] issued = new String[10];

    int availablecount = 0;
    int issuedcount = 0;

    //Add a book
    void addbook(String bookname){
        available[availablecount] = bookname;
        availablecount++;
        System.out.println(bookname + " added successfully!");
    }

    //Show available books
    void availablebooks(){
        System.out.println("Available Books!");
        for(int i = 0;i < availablecount;i++){
            if(available[i] != null){
                System.out.println("-" + available[i]);
            }
        }
    }

    //Issue a book
    void issuebook(String bookname){
        for(int i = 0;i < availablecount;i++){
            if(available[i] != null && available[i].equals(bookname)){
                issued[issuedcount] = bookname;
                issuedcount++;

                available[i] = null;
                System.out.println(bookname + " issued succesfully!");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    //Return a book
    void returnbook(String bookname){
        for(int i = 0;i < issuedcount;i++){
            if(issued[i] != null && issued[i].equals(bookname)){
                available[availablecount] = bookname;
                availablecount++;

                issued[i] = null;
                System.out.println(bookname + " returned succesfuuly!");
                return;
            }
        }
        System.out.println("This book was not issued!");
    }
}

class exercise4{
    public static void main(String[] args){
        library lib = new library();

        lib.addbook("Java!");
        lib.addbook("Python!");
        lib.addbook("C++");

        lib.availablebooks();

        lib.issuebook("Python!");

        lib.availablebooks();

        lib.returnbook("Python!");

        lib.availablebooks();

    }
}