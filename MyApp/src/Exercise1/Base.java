package Exercise1;

public class Base implements IBase {
    String firstName;
    String lastName;
    int age;

    @Override
    public void Print() {
        System.out.println(firstName + " " + lastName);
    }

    @Override
    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void SetLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void SetAge(int age) {
        this.age = age;
    }

    @Override
    public String GetFirstName() {
        return this.firstName;
    }

    @Override
    public String GetLastName() {
        return this.lastName;
    }

    @Override
    public int GetAge() {
       return this.age;
    }

    @Override
    public void PrintAge() {
        System.out.println("Print age: " + age);
    }
}