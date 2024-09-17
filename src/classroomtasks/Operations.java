package classroomtasks;

public class Operations {
    public static void main(String args[]){
        Student st =  new Student();
        st.firstName = "Samuella";
        st.lastName = "Mugisha";
        st.address = "Kigali";
        Student.studentOfNumber++;

        System.out.println("Number of Students is : " + Student.studentOfNumber);

        Student st2 =  new Student();
        st2.firstName = "Josh";
        st2.lastName = "Kwizera";
        st2.address = "Kayonza";
        Student.studentOfNumber++;

        System.out.println("Number of Students is : " + Student.studentOfNumber);
        System.out.println(("The first is " + st.firstName + " and second is " + st2.firstName));

        Student st3 =  new Student();
        st3.firstName = "Kevine";
        st3.classYear = 2;

        System.out.println("First name is : " + st3.firstName + " and class year is : " + st3.classYear);

        Teacher t1 = new Teacher();
        t1.firstName = "Kevin";
        t1.subject = "Java";

        System.out.println("Teacher's name is : " + t1.firstName + " and subject is : " + t1.subject);

    }
}
