package Faculty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String id;
    String firstName;
    String lastName;
    Date insertDate;
    Date dateOfBirth;
    Date lastUpdate;
    String studentNumber;
    Gender gender;

    public Student(String firstname, String lastName, String dateOfBirth, Gender gender) {
        this.id = Helper.generateStudentId();
        this.firstName = firstname;
        this.lastName = lastName;
        this.insertDate = Helper.getCurrentDate();
        this.dateOfBirth = Helper.convertStringDateToDate(dateOfBirth);
        this.lastUpdate = Helper.getCurrentDate();
        this.studentNumber = Helper.generateStudentNumber(firstname, lastName);
        this.gender = gender;
    }

    public void Print() {
        // Defining date format that will be used
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String stringBuilder = "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Gender: " + gender + "\n" +
                "Student Number: " + studentNumber + "\n" +
                "Date of Birth: " + dateFormat.format(dateOfBirth) + "\n" +
                "Insert Date: " + dateFormat.format(insertDate) + "\n" +
                "Last Update: " + dateFormat.format(lastUpdate) + "\n";

        System.out.println(stringBuilder);
    }
}