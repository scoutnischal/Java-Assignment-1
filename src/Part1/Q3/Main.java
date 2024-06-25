package Part1.Q3;

public class Main {
	public static void main(String args []) {
		Rectangle r1 = new Rectangle(5,10,"Yellow");
		Rectangle r2 = new Rectangle(5, 10, "Yellow");
		
		System.out.println("Display the properties of Rectangle1:");
		System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Color: " + r1.getColor());
        System.out.println("Area: " + r1.findArea());
        System.out.println("Perimeter: " + r1.findPerimeter());
        System.out.println("\n======================================\n");
        
        System.out.println("Display the properties of Rectangle2:");
		System.out.println("Width: " + r2.getWidth());
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Color: " + r2.getColor());
        System.out.println("Area: " + r2.findArea());
        System.out.println("Perimeter: " + r2.findPerimeter());
        
	}
}
