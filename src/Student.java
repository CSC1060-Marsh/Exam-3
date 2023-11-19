public class Student extends Person{
    //This creates a constructor.
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        //This calls in the variables from Person.
        super(name, address, phoneNumber, emailAddress);
        //This defines status.
        this.status = status;
    }
    //This adds a new string variable called status.
    private final String status;
    //This creates a getter for status.
    public String getStatus() {
        return status;
    }
    //Using override, this adds to getDetails from person.
    @Override
    public String getDetails() {
        //This returns getDetails from person plus the status from student.
        return super.getDetails() + "\nStatus: " + this.getStatus();
    }

}
