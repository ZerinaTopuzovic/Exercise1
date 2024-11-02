import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintNumbersBackwards();
    }

    public static void PrintNumbersBackwards() {
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
        while (number < 1 || number > 20) {
            System.out.println("Invalid number. Enter again.");
            number = myObj.nextInt();
        }

        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
        SumNumbersToN(number);
    }

    public static void SumNumbersToN(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + number;
        }
        System.out.println("Sum is: " + sum);
    }

    public static void EnterAndPrintNameAndAge() {
        String name = Helper.EnterString("Please enter your name.");
        int age = Helper.EnterAge("Please enter age.", "Invalid age.\nEnter again.");
        if (age < 20) {
            System.out.println(name + age + " you are very young.");
        }
        if (age > 20 && age < 30) {
            System.out.println(name + age + " you are young.");
        }
        if (age >= 30 && age <= 45) {
            System.out.println(name + age + " you are in your best age.");
        }
    }

    public static float Average(int numOfValues) {
        int[] numbers = Helper.EnterNumbers("nn", numOfValues);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        float average = sum / numbers.length;
        return average;
    }

    public static void CheckNumber(double number) {
        if (number < 2.5) {
            System.out.println("2");
        }
        if (number >= 2.5 && number < 3.5) {
            System.out.println("3");
        }
        if (number >= 3.5 && number < 4.5) {
            System.out.println("4");
        }
        if (number >= 4.5) {
            System.out.println("5");
        }
    }

    public static void CheckNameAndAgeEx6() {
        String[] names = new String[3];
        int[] years = new int[3];

        for (int i = 0; i < 3; i++) {
            String name = Helper.EnterString("Please enter your name.");
            names[i] = name;
            //names[i] = EnterString(""Please enter your name.""); // Another way

            int year = Helper.EnterNumber("Please enter your age.");
            years[i] = year;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = 0; i < years.length; i++) {
            System.out.println(years[i]);
        }

        boolean nameFound = false;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if (i != j && names[i].equals(names[j])) {
                    nameFound = true;
                    System.out.println("Same names found: " + names[i] +
                            " at index " + i + " and " + names[j] + " at index " + j);
                    break;
                }
            }
            if (nameFound) {
                break;
            }
        }
    }

    public static void DentistEx8() {
        String answer = Helper.EnterString("Are you afraid of dentist?");
        final String yes = "yes";
        final String no = "no";

        // Example 1
        switch (answer) {
            case no:
                System.out.println("You are brave!");
                break;
            case yes:
                System.out.println("Me, too!");
                break;
            default:
                System.out.println("Invalid answer.");
        }

        // Example 2
        if (answer.equals(no)) {
            System.out.println("You are brave!");
        } else if (answer.equals(yes)) {
            System.out.println("Me, too!");
        } else {
            System.out.println("Invalid answer.");
        }
    }

    public static void WeekDaysEx10() {
        String weekDay = Helper.EnterString("Which day is today?");

        switch (weekDay) {
            case "Monday", "Tuesday", "Wednesday", "Thursday":
                System.out.println("Can't wait for the weekend!");
                break;
            case "Friday":
                System.out.println("It’s Friday, Friday. Gotta get down on Friday");
                break;
            case "Saturday", "Sunday":
                System.out.println("Yay, it's weekend!");
                break;
            default:
                System.out.println("Invalid answer.");
        }
    }

    public static int CountNumberOfWordsEx11() {
        String input = Helper.EnterString("Please be creative with your input.");
        String[] words = input.split("\\s+");
        return words.length;
    }

    public static void SumOfNumbersEx12() {
        int enteredNum = Helper.EnterNumber("Please enter any number.");
        int sum = 0;
        for (int i = 0; i <= enteredNum; i++) {
            sum += i;
        }
        System.out.println("Sum of all numbers is: " + sum);
    }

    public static void LessThan20Ex13() {
        int enteredNum = Helper.EnterNumber("Please enter number less than 20.");

        if (enteredNum <= 20) {
            for (int i = enteredNum; i >= 1; i--) {
                System.out.println("Backward numbers: " + i);
            }
        } else {
            System.out.println("Entered number is bigger than expected: " + enteredNum);
        }
    }

    public static void CountPositiveAndNegativeNumsEx22() {
        int posCounter = 0;
        int negCounter = 0;
        int number = Helper.EnterNumber("Please enter number.");

        if (number > 0) {
            posCounter++;
        }

        if (number < 0) {
            negCounter++;
        }

        while (number != 0) {
            number = Helper.EnterNumber("Please enter next number.");

            if (number > 0) {
                posCounter++;
            }

            if (number < 0) {
                negCounter++;
            }
        }

        if ((posCounter + negCounter) > 0) {
            System.out.println("You entered " + (posCounter + negCounter) + " numbers.");
        }

        System.out.println("Number of positive ones: " + posCounter);
        System.out.println("Number of negative ones: " + negCounter);
    }

    public static void FindMinAndMaxNumberEx30() {
        List<Integer> listOfNums = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int num = Helper.EnterNumber("Please enter number.");
            listOfNums.add(num);
        }
        Collections.sort(listOfNums);

        int min = listOfNums.getFirst();
        int max = listOfNums.getLast();

        System.out.println(listOfNums);
        System.out.println("Min is: " + min + " and max is: " + max);
    }

    public static void FirstMiddleLastEx31() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int num = Helper.EnterNumber("Please enter number.");
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        int size = numbers.size();
        int middle = size / 2;

        System.out.println(numbers);

        if (size % 2 == 0) {
            System.out.println("Middle elements are: " + numbers.get(middle - 1) + ", " + numbers.get(middle));
        } else {
            System.out.println("Middle element is: " + numbers.get(middle));
        }

        Collections.sort(numbers);

        int min = numbers.getFirst();
        int max = numbers.getLast();

        System.out.println("Min is: " + min + " and max is: " + max);
    }

    public static void OddNumbersEx32() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        int sum = 0;

        while (sum <= 150) {
            int number = Helper.EnterNumber("Enter number: ");
            numbers.add(number);
            sum += number;
            System.out.println("Current sum is: " + sum);
        }

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        Collections.sort(oddNumbers, Collections.reverseOrder());
        System.out.println("Descending sort of odd numbers is: " + oddNumbers);
    }

    public static void EvenNumbersEx33() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        int sum = 0;

        while (sum <= 150) {
            int number = Helper.EnterNumber("Enter number: ");
            numbers.add(number);
            sum += number;
            System.out.println("Current sum is: " + sum);
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        Collections.sort(evenNumbers);
        System.out.println("Ascending sort of odd numbers is: " + evenNumbers);
    }

    public static void FourLetterWordsEx34() {
        List<String> words = new ArrayList<>();
        words.add("sun");
        words.add("stars");
        words.add("earth");
        words.add("water");
        words.add("ash");

        List<String> fourLetterWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() > 4) {
                fourLetterWords.add(word);
            }
        }
        System.out.println("Words with more than 4 letters are: " + fourLetterWords);
    }

    public static void ShortestLongestWordEx35() {
        List<String> words = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String word = Helper.EnterText("Please enter word.");
            words.add(word);
        }
        System.out.println(words);

        String longestWord = words.get(0);
        String shortestWord = words.get(0);

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        System.out.println("The shortest word is: " + shortestWord);
    }

    public static void OddEvenAverageEx36() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = Helper.EnterNumber("Please enter number.");
            numbers.add(number);
        }
        System.out.println(numbers);

        int evenNumCount = 0;
        int oddNumCount = 0;
        int sumOfEvenNums = 0;
        int sumOfOddNums = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumCount++;
                sumOfEvenNums += number;
            } else {
                oddNumCount++;
                sumOfOddNums += number;
            }
        }

        System.out.println("Even numbers count: " + evenNumCount);
        System.out.println("Odd numbers count: " + oddNumCount);

        double averageOfEvenNums = evenNumCount > 0 ? (double) sumOfEvenNums / evenNumCount : 0;
        System.out.println("Average sum of even numbers: " + averageOfEvenNums);

        if (sumOfEvenNums > sumOfOddNums) {
            System.out.println("Sum of even numbers is bigger.");
        } else if (sumOfOddNums > sumOfEvenNums) {
            System.out.println("Sum of odd numbers is bigger.");
        } else {
            System.out.println("Sums are the same.");
        }
    }
}