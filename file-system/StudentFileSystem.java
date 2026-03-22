import java.io.*;
import java.util.Scanner;

public class StudentFileSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add student to file
    public static void addStudent(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("students.txt", true);

            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            String marks = sc.nextLine();

            fw.write(id + "," + name + "," + marks + "\n");
            fw.close();

            System.out.println("Student Saved!");

        } catch (IOException e) {
            System.out.println("Error writing file!");
        }
    }

    // Read students from file
    public static void viewStudents() {
        try {
            File file = new File("students.txt");

            if (!file.exists()) {
                System.out.println("No data found!");
                return;
            }

            Scanner fileReader = new Scanner(file);

            System.out.println("\n--- Student Records ---");

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }

            fileReader.close();

        } catch (Exception e) {
            System.out.println("Error reading file!");
        }
    }
}
