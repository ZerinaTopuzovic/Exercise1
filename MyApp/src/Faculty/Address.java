package Faculty;

public class Address {
    String streetName;
    String city;
    int streetNumber;
    int postalCode;

    public Address(String streetName, String city, int streetNumber, int postalCode) {
        this.streetName = streetName;
        this.city = city;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public void Print() {
        String sb = "Address Information:\n" +
                "Street Number: " + streetNumber + "\n" +
                "Street Name: " + streetName + "\n" +
                "City: " + city + "\n" +
                "Postal Code: " + postalCode + "\n";

        System.out.println(sb);
    }
}