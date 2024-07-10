public class ifstatement {
    public static void main(String[] args) {
        int number = 10;
        String language = "Java";

        //checks if number is positive or negative
        if (number < 0){
            System.out.println("Number is negative");
        }
        System.out.println("Number is positive");

        //checks if language is Java
        if(language == "Java"){
            System.out.println(language + " is the best programming language");
        }
    }
}
