public class Staff extends Employee{
    //This adds a new constructor.
    public Staff(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String title) {
        //This calls the variables from person and employee.
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        //This defines title.
        this.title = title;
    }
    //This adds a new variable called title.
    private final String title;
    //This adds a getter for title.
    public String getTitle() {
        return title;
    }
    //This returns department for the getDepartment getter using override.
    @Override
    public String getDepartment() {
        return department;
    }
    //This returns monthlySalary for the getMonthlySalary getter using override.
    @Override
    public double getMonthlySalary() {
        return monthlySalary;
    }
    //This returns dateHired for the getDateHired getter using override.
    @Override
    public String getDateHired() {
        return dateHired;
    }
    //Using override, this adds to getDetails from person.
    @Override
    public String getDetails() {
        //This returns the details from person and employee and adds title.
        return super.getDetails() + "\nTitle: " + this.getTitle();
    }
}
