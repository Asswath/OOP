import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denom = sc.nextInt();

            int result = num / denom; // Might cause ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            sc.close();
            System.out.println("Program execution completed.");
        }
    }
}
