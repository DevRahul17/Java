/*-----------------String methods----------------------------------*/
class stringmethods{
    public static void main(String[] args){
        String name = "Rahul";
        int value = name.length();//.length() is used to find the length of a string
        System.out.println(value);

        String lstring = name.toLowerCase();//.toLowerCase() convert all string characters to LowerCase
        System.out.println(lstring);

        String ustring = name.toUpperCase();//.toUpperCase() convert all string characters to UpperCase
        System.out.println(ustring);

        String nontrimmedstring = "       Java             ";
        System.out.println(nontrimmedstring);

        String trimmedstring = "          Java             ";
        //String trimmedstring = nontrimmedstring.trim();Same as upper line
        System.out.println(trimmedstring.trim());//.trim() can release all spaces and print without spaces

        System.out.println(name.substring(3));//.substring()In this it start from the third index of String Rahul and goes till the end
        System.out.println(name.substring(0,4));//.substring()//In this it start from the 0th index of String Rahul and goes till the 3rd and not onvolving the 4th index

        System.out.println(name.replace('h','p'));//.replace('old char','new char')In this it replace old character to new character
        System.out.println(name.replace("hul","kgf"));//.replace()In this it replace target substring to new given substring and remember ""
        System.out.println(name.replace("h","mul"));//.replace()In this it replace single character to new given substring and remember ""

        System.out.println(name.startsWith("Rah"));//.startsWith() follows boolean if start with match returns true else false
        System.out.println(name.startsWith("Kum"));
        System.out.println(name.endsWith("hul"));//.endsWith() follows boolean if ends with match returns true else false
        System.out.println(name.endsWith("Kum"));
        System.out.println(name.charAt(3));//.charAt() returns which character is present at a given index

        System.out.println(name.indexOf("a"));//.indexOf() determine the given character is come on which index first and search from starting
        System.out.println(name.lastIndexOf("u"));//.lastIndexOf() determine from last and give the index
        System.out.println(name.indexOf("hu"));
        System.out.println(name.indexOf("hu",0));//It gave that to find hu from givven index here we put 0
        String newname = "Harryrry";
        System.out.println(newname.indexOf("rry",4));//Here it start finding from index 4th
        System.out.println(newname.indexOf("xyz",4));//Returns -1 if not present in string

        System.out.println(name.equals("Rahul"));//If name is equal gave true else false follows boolean
        System.out.println(name.equals("Mahul"));//If name is equal gave true else false follows boolean
        System.out.println(name.equalsIgnoreCase("Rahul"));//If name is equal gave true else false follows boolean and don't need same case
        System.out.println(name.equalsIgnoreCase("rahul"));//If name is equal gave true else false follows boolean and don't need same case
    }
}