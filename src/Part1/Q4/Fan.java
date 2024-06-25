package Part1.Q4;

public class Fan {
	
    // Constants for fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    // Properties 
    private int speed;
	private boolean on;
    private double radius;
    private String color;
    
    // Constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    public int getSpeed() {
		return speed;
	}
    

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public boolean isOn() {
		return on;
	}


	public void setOn(boolean on) {
		this.on = on;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	//return Fan Properties 
    public String toString() {
        String fanStatus = (on) ? "Fan is on\n" : "Fan is off\n";
        String fanSpeed;
        switch (speed) {
            case SLOW:
                fanSpeed = "Speed: SLOW\n";
                break;
            case MEDIUM:
                fanSpeed = "Speed: MEDIUM\n";
                break;
            case FAST:
                fanSpeed = "Speed: FAST\n";
                break;
            default:
                fanSpeed = "Invalid speed setting\n";
        }
        String fanRadius = "Radius: " + radius + " inches\n";
        String fanColor = "Color: " + color + "\n";

        return fanStatus + fanSpeed + fanRadius + fanColor;
    }
}