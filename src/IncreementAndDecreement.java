public class IncreementAndDecreement {
    public static void main(String[] args) {
        int num1 = 5;
        int num2  = 10;

        //increement
        System.out.println(num1++); // 5
        System.out.println(num1); // 6
        System.out.println(++num1); // 7

        num1++;
        System.out.println(num1); // 8

        //decreement
        System.out.println(num2--); // 10
        System.out.println(num2); // 9
        System.out.println(--num2); // 8

        num2--;
        System.out.println(num2); // 7

    }
}
