package Basics1;

public class InstanceOf {
    public static void main(String[] args) {
        String str = "Is str an instance of String? ";
        boolean result = str instanceof String;

        System.out.println(str + result); //true
    }
}
