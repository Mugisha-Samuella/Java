package Basics1;

public class StringInstanceProperty {
    public static void main(String[] args) {
        String school = "Rwanda Coding Academy";

        System.out.println(school.length()); //Gets the length of the string (Whitespaces included)

        //Checks if String is empty
        System.out.println(school.isEmpty()); //output is false

        //String to uppercase
        System.out.println(school.toUpperCase());

        //string to lowercase
        System.out.println(school.toLowerCase());

        //Comparing two Object Strings
        String string1 = new String("rca");
        String string2 = new String("rca");

        System.out.println(string1 == string2); //false
    }
}
