package Part2.Q1;

public class Student extends Person {
    public enum Status {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }

    private Status status;

    public Student(String name, String address, String phoneNumber, String email, Status status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Student: %s", name);
    }
}

