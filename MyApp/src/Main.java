import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner myObj = new Scanner(System.in);
        // PrintNumbersBackwards();
        PrintNumbersBackwards2();
    }

    public static void PrintNumbersBackwards () {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number 1-20");
        int number = myObj.nextInt();
        if (number > 1 && number <= 20) {
            for (int i = number; i > 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("NUmber you have entered is not in range.");
        }
    }

    public static void PrintNumbersBackwards2() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number 1-20");
        int number = myObj.nextInt();
        do {
            number = myObj.nextInt();
            System.out.println("Invalid number. Enter again.");
        } while (number < 1 || number > 20);

            for (int i = number; i > 0; i--) {
                System.out.println(i);
            }
        sumBackw(number);
    }

    public static void sumBackw (int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + number;
        }
        System.out.println("Sum is: " + sum);
    }
}