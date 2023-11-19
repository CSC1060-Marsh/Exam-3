public class Person {
    //This defines a name string.
    private final String name;
    //This defines an address string.
    private final String address;
    //This defines a phoneNumber string.
    private final String phoneNumber;
    //This defines an emailAddress string.
    private final String emailAddress;
    //This adds a new constructor for the above variables.
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        //This defines name.
        this.name = name;
        //This defines address.
        this.address = address;
        //This defines phoneNumber.
        this.phoneNumber = phoneNumber;
        //This defines emailAddress.
        this.emailAddress = emailAddress;
    }
    //This creates a getter for name.
    public String getName() {
        return name;
    }
    //This creates a getter for address.
    public String getAddress() {
        return address;
    }
    //This creates a getter for phoneNumber.
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //This creates a getter for emailAddress.
    public String getEmailAddress() {
        return emailAddress;
    }
    //This creates a getter for the details.
    // This makes it much simpler to print out the details of all the people in the array
    // instead of writing out the this.getName, this.getAddress, and so on in the foreach loop.
    public String getDetails() {
        //This returns the basic details using the above getters.
        return "Name: " + this.getName()
                + "\nAddress: " + this.getAddress()
                + "\nPhone Number: " + this.getPhoneNumber()
                + "\nEmail Address: " + this.getEmailAddress();
    }
}
