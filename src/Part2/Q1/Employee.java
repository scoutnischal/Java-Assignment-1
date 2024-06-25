package Part2.Q1;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s", name);
    }
}

