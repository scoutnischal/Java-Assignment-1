package Part2.Q4;

public class TestGeometricObject {
 public static void main(String[] args) {
     Circle circle1 = new Circle(5);
     Circle circle2 = new Circle(7);

     Cylinder cylinder1 = new Cylinder(3, 5);
     Cylinder cylinder2 = new Cylinder(4, 6);

     //Find the larger circle
     Circle largerCircle = (Circle) GeometricObject.max(circle1, circle2);
     System.out.println("Larger Circle: Radius = " + largerCircle.getRadius());

     //Find the larger cylinder
     Cylinder largerCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
     System.out.println("Larger Cylinder: Radius = " + largerCylinder.getRadius()
                        + ", Height = " + largerCylinder.getHeight());
 }
}
