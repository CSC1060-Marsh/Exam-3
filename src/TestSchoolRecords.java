import java.lang.reflect.Array;

public class TestSchoolRecords {
    public static void main(String[] args) {
        //This creates a new person array named people with a length of 6.
        Person[] people = new Person[6];
        //This defines the 0th term of the array.
        people[0] = new Student("Bob", "223 North Avenue", "1-800-224-1924", "iamtotalalybob@gmail.com", "Freshman");
        //This defines the 1st term of the array.
        people[1] = new Student("Billy", "666 Student Drive", "(970)-666-9243", "iambilly@gmail.com", "Senior");
        //This defines the 2nd term of the array.
        people[2] = new Faculty("Mr. Jones", "887 Faculty Road", "1-800-245-6789", "hiyastudent@gmail.com", "9AM-2PM", "Junior", "Human Resources", 29345.23, "December 2, 1883");
        //This defines the 3rd term of the array.
        people[3] = new Faculty("Mrs. Peacock", "223 Big Mansion Road", "(970)-123-4567", "iamfromclue@gmail.com", "2AM-3AM", "Senior", "Science", 12.0, "7 September 1999");
        //This defines the 4th term of the array.
        people[4] = new Staff("George", "999 Staffy Avenue", "1-800-234-5678", "staffdude23@gmail.com", "Janitorial", 999999.23, "2 February 2222", "Cleaning Man");
        //This defines the 5th term of the array.
        people[5] = new Staff("Mrs. Scarlet", "224 Big Mansion Boulevard", "(970)-555-5555", "hitherehello@gmail.com", "Admissions", 2345.67, "5/6/78", "Annoying Telemarketer");

        //This creates a foreach loop for each instance of a person in the array.
        for (Person person : people) {
            //This prints out the person's details.
            System.out.println(person.getDetails());
            //This prints out a new line for easy reading.
            System.out.println();
        }

        //This defines a new array called newPeople.
        Person[] newPeople = new Person[10];
        //This does the following 10 times.
        for (int i = 0; i < 10; i++) {
            //This does the following if the ith term of people is an instance of employee.
            if (people[i] instanceof Employee) {
                //This adds the ith term of people to the ith term of newPeople.
                newPeople[i] = people[i];
            }
        }
    }
}
