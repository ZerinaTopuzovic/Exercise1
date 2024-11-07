package Faculty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Scanner for input
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Address
        Address address = new Address("Campus", "Sarajevo", 38, 71000);

        // Initial set of students
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Tom", "Hardy", "02/18/2004", Gender.MALE);
        Student s2 = new Student("Jane", "Doe", "03/23/2006", Gender.FEMALE);
        Student s3 = new Student("Harry", "Potter", "09/13/1999", Gender.MALE);
        Student s4 = new Student("Arnold", "Schwarzenegger", "11/29/2001", Gender.MALE);
        Student s5 = new Student("Margot", "Robbie", "06/11/2002", Gender.FEMALE);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        // Faculty
        Faculty faculty = new Faculty("Faculty of Information Technology", address, students);

        // Main loop
        while (true) {
            // Display the menu
            printMenu();

            // Get user choice
            int choice = getValidIntegerInput("Please choose an option: ");

            // Process the menu option
            switch (choice) {
                case 1:
                    faculty.PrintAddress();
                    break;
                case 2:
                    faculty.PrintStudents();
                    break;
                case 3:
                    String firstName = getFirstName();
                    String lastName = getLastName();
                    String dateOfBirth = getValidDateInput();
                    Gender gender = getGender();
                    faculty.AddNewStudent(firstName, lastName, dateOfBirth, gender);
                    break;
                case 4:
                    String studentNumber = getStudentNumber();
                    faculty.RemoveStudent(studentNumber);
                    break;
                case 5:
                    String searchTerm = getSearchQuery();
                    faculty.SearchStudents(searchTerm);
                    break;
                case 0:
                    System.out.println("Exiting the application.");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Prints the main menu options
    private static void printMenu() {
        System.out.println("\n=============================");
        System.out.println("1. Faculty Address");
        System.out.println("2. List of Students");
        System.out.println("3. Add New Student");
        System.out.println("4. Remove Student");
        System.out.println("5. Search Students");
        System.out.println("0. Exit");
        System.out.println("=============================");
    }

    // Get a valid integer input from the user
    private static int getValidIntegerInput(String prompt) {
        int input = -1;
        while (input < 0) {
            System.out.print(prompt);
            String userInput = scanner.nextLine();
            try {
                input = Integer.parseInt(userInput);
                if (input < 0) {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return input;
    }

    // Function to get the first name from the user
    private static String getFirstName() {
        System.out.print("Enter first name: ");
        return scanner.nextLine(); // Return the first name entered by the user
    }

    // Function to get the last name from the user
    private static String getLastName() {
        System.out.print("Enter last name: ");
        return scanner.nextLine(); // Return the last name entered by the user
    }

    private static Gender getGender() {
        System.out.println("Choose gender:");

        Gender[] genders = Gender.values();

        // Print out all gender options
        for (int i = 0; i < genders.length; i++) {
            System.out.println((i + 1) + " - " + genders[i]);
        }

        // Create a scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Keep prompting the user until a valid number is entered
        while (true) {
            System.out.print("Enter the number corresponding to your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                // Check if the input is valid
                if (choice >= 1 && choice <= genders.length) {
                    return genders[choice - 1];  // Return the selected gender
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + genders.length + ".");
                }
            } else {
                // If the user does not enter an integer, prompt again
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }
    }

    // Function to get a valid date of birth input (dd/MM/yyyy format)
    private static String getValidDateInput() {
        String dateOfBirth = "";
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter date of birth (dd/MM/yyyy): ");
            dateOfBirth = scanner.nextLine();

            // Validate the date format
            if (isValidDate(dateOfBirth)) {
                valid = true;  // Exit the loop if the date is valid
            } else {
                System.out.println("Invalid date format. Please use the format dd/MM/yyyy.");
            }
        }

        return dateOfBirth;  // Return the valid date of birth
    }

    // Function to check if the date input is valid
    private static boolean isValidDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Strict date validation (e.g., 31/02/2024 is not valid)

        try {
            // Try to parse the date
            dateFormat.parse(date);
            return true; // If parsing is successful, it's a valid date
        } catch (ParseException e) {
            // If parsing fails, it's an invalid date
            return false;
        }
    }

    // Function to get the student number from the user
    private static String getStudentNumber() {
        System.out.print("Enter student number: ");
        return scanner.nextLine(); // Return the student number entered by the user
    }

    // Function to get the search term from the user
    private static String getSearchQuery() {
        System.out.print("Enter search term: ");
        return scanner.nextLine(); // Return the search term entered by the user
    }
}