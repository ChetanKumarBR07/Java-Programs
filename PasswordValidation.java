import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        boolean lengthCheck = pwd.length() >= 8;
        boolean uppercaseCheck = pwd.matches(".*[A-Z].*");
        boolean lowercaseCheck = pwd.matches(".*[a-z].*");
        boolean digitCheck = pwd.matches(".*\\d.*");
        boolean specialCharCheck = pwd.matches(".*[@#!$%^&()].*");
        boolean valid = lengthCheck && uppercaseCheck && lowercaseCheck && digitCheck && specialCharCheck;
        System.out.println(valid ? "Valid Password" : "Invalid Password");

        sc.close();
    }
}
