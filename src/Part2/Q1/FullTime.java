package Part2.Q1;

public class FullTime extends Staff {
    public FullTime(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired,
                    String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired, title);
    }

    @Override
    public String toString() {
        return String.format("FullTime Staff: %s", name);
    }
}
