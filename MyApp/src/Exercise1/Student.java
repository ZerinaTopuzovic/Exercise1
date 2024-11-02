package Exercise1;

public class Student extends Base {
    String index;

    //constructors
    public Student() {

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean equals(Student obj) {
        return this.firstName == obj.firstName && this.lastName == obj.lastName && this.age == obj.age;
    }
}