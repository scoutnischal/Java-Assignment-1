package Part2.Q1;

public class Main {
    public static void main(String[] args) {
        // Create instances
        MyDate date = new MyDate(2024, 6, 23);
        Student student = new Student("Alice", "123 College St", "555-1234", "alice@student.com", Student.Status.JUNIOR);
        Faculty faculty = new Faculty("Bob", "456 University Ave", "555-5678", "bob@faculty.com",
                                      "Science Building, Room 101", 60000, date, "Mon-Fri 9am-5pm", "Professor");
        FullTime fullTimeStaff = new FullTime("Eve", "789 Staff St", "555-9012", "eve@staff.com",
                                              "Admin Building, Room 201", 50000, date, "HR Manager");
        PartTime partTimeStaff = new PartTime("Frank", "101 Part Time Blvd", "555-3456", "frank@parttime.com",
                                              "Librarian Office", 25.0, date, "Librarian", 20);

        // Displaying information
        System.out.println(student);
        System.out.println(faculty);
        System.out.println(fullTimeStaff);
        System.out.println(partTimeStaff);
        
        // Calculate earnings for part-time staff
        System.out.printf("Earnings for %s: $%.2f%n", partTimeStaff.name, partTimeStaff.calculateEarnings());
    }
}


