package Basics1;

import java.util.Arrays;

public class UsingStrings {
    public static void main(String[] args) {
        String literalString = "Hello world!"; //A literal String

        //String ObjectString = new String("Hello World"); //This is an Object String

        String myString = "Practice coding";
        String myString2 = "by doing projects";

        String[] strs = myString.split(" ");

        System.out.println(Arrays.toString(strs) + myString2);
    }
}
