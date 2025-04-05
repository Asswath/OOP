import java.util.Scanner;
import java.lang.String;

public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
