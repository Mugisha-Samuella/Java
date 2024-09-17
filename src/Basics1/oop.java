package Basics1;

import java.util.ArrayList;

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

        //favorite food
        User f = new User();
        f.set_favouritefood(User.Favouritefood.Ibiraha);
        System.out.println("Favourite Food(Snack): " + f.get_favouritefood());


        /**
         * Using Constructors
         * school
         */

           School myschool = new School("Rca", "Nyabihu");
        System.out.println("School: " + myschool.get_schoolname());
        System.out.println("Address: " + myschool.get_schooladdress());


        /**
         * Method overriding
         */

        User u = new User("John", "Bronze");
        User u2 = new User("John", "Bronze");

        System.out.println(u.equals(u2)); //true

        /**
         * Generic Lists
         */

        //User 3
        User u3 = new User();
        u3.set_name("Kevin");

        ArrayList<User> Users = new ArrayList<User>();
        Users.add(u3);

        System.out.println(Users.get(0).get_name());

        //User 4
        User u4 = new User("Josh", "Gold");
        Users.add(u4);

        System.out.println(Users.get(1).get_membership());


        //User 5
        Users.add(new User("Bruno"));
        Users.add(new User("Vicky"));

        for (User user : Users) {
            System.out.println(user.get_name());
        }

    }
}
