import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Update Student by ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    sms.addStudent(name, age, studentId, course);
                    break;
                case 2:
                    sms.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    String searchId = scanner.nextLine();
                    sms.findStudent(searchId);
                    break;
                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    String deleteId = scanner.nextLine();
                    sms.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.print("Enter Student ID to Update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Course: ");
                    String newCourse = scanner.nextLine();

                    sms.updateStudent(updateId, newName, newAge, newCourse);
                    break;
                case 6:
                    System.out.println("Thank you for using Student Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
