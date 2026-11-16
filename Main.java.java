import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctName = "Vishalini";
        String correctPassword = "123456";

        System.out.println("================================");
        System.out.println(" FACE VERIFICATION LOGIN SYSTEM");
        System.out.println("================================");

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        if (!name.equalsIgnoreCase(correctName)) {
            System.out.println("Invalid User");
            sc.close();
            return;
        }

        System.out.println("\nName Verified Successfully!");

        System.out.println("\nFace Verification Required");
        System.out.println("Demo: Face verification must be connected here.");

        System.out.print("\nEnter Face Verification Result (yes/no): ");
        String face = sc.nextLine();

        if (!face.equalsIgnoreCase("yes")) {
            System.out.println("Face Verification Failed");
            sc.close();
            return;
        }

        System.out.println("\nFace Verification Successful!");

        System.out.println("\nEnter Numeric Password:");

        String password = "";

        for (int i = 0; i < correctPassword.length(); i++) {

            System.out.print("Enter digit " + (i + 1) + ": ");
            String digit = sc.nextLine();

            if (!digit.matches("[0-9]")) {
                System.out.println("RED - Numbers Only Allowed");
                i--;
                continue;
            }

            password += digit;

            if (correctPassword.startsWith(password)) {
                System.out.println("GREEN - Correct Digit");
            } else {
                System.out.println("RED - Wrong Digit");
                break;
            }
        }

        if (password.equals(correctPassword)) {
            System.out.println("\nAccess Granted!");
            System.out.println("Welcome " + name);
        } else {
            System.out.println("\nAccess Denied!");
        }

        sc.close();
    }
}