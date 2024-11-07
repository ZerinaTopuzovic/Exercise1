package Faculty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Helper {
    /**
     * Generates student id
     *
     * @return String
     */
    public static String generateStudentId() {
        UUID uuid = UUID.randomUUID();

        // Convert it to a string (this is the GUID)
        String guid = uuid.toString();

        return guid;
    }

    /**
     * Gets current date
     *
     * @return Date
     */
    public static Date getCurrentDate() {
        return new Date();
    }

    /**
     * Converts string date into Date
     *
     * @param dateOfBirth
     * @return Date
     */
    public static Date convertStringDateToDate(String dateOfBirth) {
        // Define the date format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Initialize the date object
        Date date = null;

        try {
            // Parse the date string into a Date object
            date = sdf.parse(dateOfBirth);
        } catch (ParseException e) {
            // Handle the exception if the date format is incorrect
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }

        return date;
    }

    /**
     * Generates student number based on the first letters of the first and last name,
     * and random number
     *
     * @param firstName
     * @param lastName
     * @return String
     */
    public static String generateStudentNumber(String firstName, String lastName) {
        return String.valueOf(firstName.charAt(0)) +
                lastName.charAt(0) +
                GetRandomNumber();
    }

    /**
     * Generates random number between 1000 and 9999
     *
     * @return Integer
     */
    private static int GetRandomNumber() {
        Random random = new Random();
        int randomNumber = 1000 + random.nextInt(9000);

        return randomNumber;
    }
}