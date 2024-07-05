//Create all the primitives (except long and double) with different values.
// Concatenate them into a string and print it to the screen,
// so it will print: H3110 w0r1d 2.0 true

public class DataTypes {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        boolean e = true;

        String s = "H" + d + b + b + a + " " + "w" + a + "r" + b + "d" + " " + c + "." + a + " " + e;

        System.out.println(s);
    }

}
