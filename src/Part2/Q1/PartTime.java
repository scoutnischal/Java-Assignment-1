package Part2.Q1;

public class PartTime extends Staff {
    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, String address, String phoneNumber, String email, String office, double hourlyRate, MyDate dateHired,
                    String title, int hoursWorked) {
        super(name, address, phoneNumber, email, office, 0, dateHired, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateEarnings() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("PartTime Staff: %s", name);
    }
}

