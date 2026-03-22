import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int enteredPin;

        double balance = 10000;
        int choice;

        System.out.println("=== Welcome to ATM ===");

        // PIN Login
        System.out.print("Enter your PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
            return;
        }

        // Menu
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount Deposited!");
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Amount Withdrawn!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
