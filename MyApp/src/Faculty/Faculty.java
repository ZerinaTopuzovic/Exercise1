package Faculty;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    Address address;
    List<Student> students;

    public Faculty(String name, Address address, List<Student> students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public void PrintStudents() {
        System.out.println("List of Faculty Students: \n");
        // Print every student in the list
        for (Student student : this.students) {
            student.Print();
        }
    }

    public void PrintAddress() {
        this.address.Print();
    }

    public void AddNewStudent(String firstName, String lastName, String dateOfBirth, Gender gender) {
        // Create a new student object with provided params
        Student newStudent = new Student(firstName, lastName, dateOfBirth, gender);

        // Add the new student to the already existing list of students
        this.students.add(newStudent);

        System.out.println("\nNew Student Added to the List of Students!\n");
        newStudent.Print();
    }

    public void RemoveStudent(String studentNumber) {
        // Go through the list of students and find one that is matching
        // If you find the record, remove the student form the list and
        // break the loop
        for (Student s : this.students) {
            if (s.studentNumber.equals(studentNumber)) {
                this.students.remove(s);
                break;
            }
        }

        System.out.println("\nStudent Successfully Removed!\n");
    }

    public void SearchStudents(String searchTerm) {
        // An empty list of students
        List<Student> students = new ArrayList<Student>();

        // Go through the list and find the matching students
        // If studentNumber, firstName or lastName contains the search term,
        // add that student to the empty list above
        for (Student s : this.students) {
            if (s.studentNumber.contains(searchTerm) || s.firstName.contains(searchTerm) || s.lastName.contains(searchTerm)) {
                students.add(s);
            }
        }

        // Check if list is empty
        // If not, print out the results
        if (!students.isEmpty()) {
            System.out.println("Search Results:\n");
            for (Student s : students) {
                s.Print();
            }
        } else {
            System.out.println("No Results Found.\n");
        }
    }
}