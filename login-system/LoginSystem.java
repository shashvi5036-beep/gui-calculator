import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        String username, password;

        int attempts = 3;

        System.out.println("=== Login System ===");

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            username = sc.nextLine();

            System.out.print("Enter Password: ");
            password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful 🎉");
                break;
            } else {
                attempts--;
                System.out.println("Wrong credentials!");
                System.out.println("Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("Account Locked!");
            }
        }
    }
}
