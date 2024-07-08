public class Concatenation {
    public static void main(String[] args) {
        String name = "Mugisha Samuella";
        String country = "Rwanda";
        int age = 92;
        String school = "Rwanda Coding Academy";

        String formattedString = String.format("Hi! I am %s and I'm from %s. I am %d years old and I currently study at %s", name, country, age, school);
        System.out.println(formattedString);

        //System.out.println("Hello! I am " + name + " and I'm from " + country + ". I am " + age  + " years old." );
    }
}
