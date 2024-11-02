package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Student s = new Student();
        Student z = new Student("Ze", "T");

        List<Student> students = new ArrayList<>();
        students.add(new Student("A", "B", 16));
        students.add(new Student("C", "D", 12));
        students.add(new Student("E", "F", 13));
        students.add(new Student("G", "H"));
        students.add(new Student("I", "J", 19));

        for (Student student : students) {
            student.PrintAge();
        }

        var ze1 = new Student("K", "L", 16);
        var ze2 = new Student("M", "N", 16);

        System.out.println(ze1.equals(ze2) ? "Same" : "Not same");

        Employee x = new Employee();
        x.workID = "fsd5";
        x.firstName = "Dino";
        x.lastName = "D";
        x.age = 13;

        x.Print();
    }
}