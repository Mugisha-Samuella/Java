public class Concatenation {
    public static void main(String[] args) {
        String name = "Mugisha Samuella"; // %s
        String country = "Rwanda"; // %s
        int age = 92; //not real //%d
        String school = "Rwanda Coding Academy"; //%s
        double gpa = 4.0; //This is not real // %f.
        char percentSign = '%'; // %c
        boolean ImTellingTheTruth = false; // %b


        String formattedString = String.format("Hi! I am %s and I'm from %s. I am %d years old and I currently study at %s. My gpa is %f. I have 100%c in each subject and am I telling the truth? %b", name, country, age, school, gpa, percentSign, ImTellingTheTruth);
        System.out.println(formattedString);

        //System.out.println("Hello! I am " + name + " and I'm from " + country + ". I am " + age  + " years old." );
    }
}
