package Exercise1;

public interface IBase {
    public void Print();

    public void SetFirstName(String firstName);
    public void SetLastName(String lastName);
    public void SetAge(int age);

    public String GetFirstName();
    public String GetLastName();
    public int GetAge();

    public void PrintAge();
}