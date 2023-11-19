public class Faculty extends Employee{
    //This adds a new constructor.
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String officeHours, String rank, String department, double monthlySalary, String dateHired) {
        //This calls the variables from person and employee.
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        //This defines officeHours.
        this.officeHours = officeHours;
        //This defines rank.
        this.rank = rank;
    }
    //This adds an officeHours variable.
    private final String officeHours;
    //This adds a rank variable.
    private final String rank;
    //This adds a getter for officeHours.
    public String getOfficeHours() {
        return officeHours;
    }
    //This adds a getter for rank.
    public String getRank() {
        return rank;
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
        //This returns the details from person and employee and adds officeHours and rank.
        return super.getDetails() + "\nOffice Hours: " + this.getOfficeHours() +
                "\nRank: " + this.getRank();
    }
}
