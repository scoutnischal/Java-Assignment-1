package Part1.Q3;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle(int width,int height, String color) {
		this.setWidth(width);
		this.setHeight(height);
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public  double  findArea() {
		double area = height*width;
		return area;
	}
	
	public double findPerimeter() {
		double result = 2*(height + width);
				
		return result;
	}
	
}