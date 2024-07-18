public class oop {
    public static void main(String[] args){

        //student
        Student samuella = new Student();
        samuella.age = 17;
        samuella.grade = 'A';
        System.out.println(samuella.age + " " + samuella.grade);

        Student joshua = new Student();
        joshua.age = 15;
        joshua.grade = 'B';
        System.out.println(joshua.age + " " + joshua.grade);

        //member
        User u1 = new User();
        u1.set_name("Samuella Mugisha");
        System.out.println("Names: " + u1.get_name());

        /**
         * Using Enums
         */

        //favorite color
        User c = new User();
        c.set_color(User.Favcolor.Blue);
        System.out.println("Favourite Color: " + c.get_color());

        //location
        User l = new User();
        l.set_location(User.Location.Kigali);
        System.out.println("Location: " + l.get_location());

        /**
         * Using Constructors
         * school
         */

        User n = new User();
        n.set_schoolname("Rca");
    }
}
