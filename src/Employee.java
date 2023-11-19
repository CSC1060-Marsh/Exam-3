public abstract class Employee extends Person{
    //This creates a new constructor.
    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired) {
        //This loads in the variables from person.
        super(name, address, phoneNumber, emailAddress);
        //This defines department.
        this.department = department;
        //This defines monthlySalary.
        this.monthlySalary = monthlySalary;
        //This defines dateHired.
        this.dateHired = dateHired;
    }
    //This adds a string variable called department.
    protected final String department;
    //This adds a double variable called monthlySalary.
    protected final double monthlySalary;
    //This adds a string variable called dateHired.
    protected final String dateHired;
    //This creates a getter for department.
    public abstract String getDepartment();
    //This creates a getter for monthlySalary.
    public abstract double getMonthlySalary();
    //This creates a getter for dateHired.
    public abstract String getDateHired();
    //Using override, this adds to getDetails from person.
    @Override
    public String getDetails() {
        //This returns the details from person as well as the new ones from employee.
        return super.getDetails() + "\nDepartment: " + this.getDepartment() +
                "\nMonthly Salary: " + this.getMonthlySalary() +
                "\nDate Hired: " + this.getDateHired();
    }
}
