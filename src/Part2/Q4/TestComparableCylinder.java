package Part2.Q4;

public class TestComparableCylinder {
 public static void main(String[] args) {
     Cylinder cylinder1 = new Cylinder(3, 5);
     Cylinder cylinder2 = new Cylinder(4, 6);

     Cylinder largerCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
     System.out.println("Larger Cylinder: Radius = " + largerCylinder.getRadius()
                        + ", Height = " + largerCylinder.getHeight());
 }
}


