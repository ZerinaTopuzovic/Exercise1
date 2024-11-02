package Exercise1;

public class Employee extends Base {
    String workID;

    // constructors
    public Employee() {

    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void PrintWithWorkID() {
        System.out.println(firstName + " " + lastName + " " + workID);
    }
}
