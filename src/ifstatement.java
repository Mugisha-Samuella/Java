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

        //if...else
        if(language == "Python"){
            System.out.println("Python is the best programming language");
        }
        else{
            System.out.println(language + " is the best programming language");
        }

        //if...else....if
        if(number > 0){
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }

        //Nested if
        int num1 = 3;
        int num2 = 5;
        int num3 = 4;
        int largest;

        if(num1 >= num2){
           if(num1 >= num3){
               largest = num1;
           } else {
               largest = num3;
           }
        } else {
            if (num2 >= num3){
                largest = num2;
            }
            else {
                largest = num3;
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
