import java.util.Scanner;

public class Helper {
    public static String EnterText(String message) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(message);
        String text = myObj.nextLine();
        return text;
    }

    public static int EnterNumber(String message) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(message);
        int number = myObj.nextInt();
        return number;
    }

    public static int EnterAge(String message, String message2) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(message);
        int age = myObj.nextInt();

        while (age < 0 || age > 2024) {
            System.out.println(message2);
            age = myObj.nextInt();
        }
        return age;
    }

    public static String EnterString(String message) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(message);
        String text = myObj.nextLine();
        return text;
    }

    public static int[] EnterNumbers(String message, int arraySize) {
        int[] numbers = new int[arraySize];

        Scanner myObj = new Scanner(System.in);
        System.out.println(message);

        for (int i = 0; i < arraySize; i++) {
            int number = myObj.nextInt();
            numbers[i] = number;
        }
        return numbers;
    }
}