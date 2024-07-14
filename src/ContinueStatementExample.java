import java.util.Scanner;

class ContinueStatementExample {
    public static void main(String[] args) {

        Double num, sum = 0.0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter number " + i + " : ");
            // takes input from the user
            num = input.nextDouble();

            // if number is negative
            // continue statement is executed
            if (num <= 0.0) {
                continue;
            }

            sum += num;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}