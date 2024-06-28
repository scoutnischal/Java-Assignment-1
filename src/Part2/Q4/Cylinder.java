package Part2.Q4;

public class Cylinder extends GeometricObject {
 private double radius;
 private double height;

 public Cylinder(double radius, double height) {
     this.radius = radius;
     this.height = height;
 }

 public double getRadius() {
     return radius;
 }

 public double getHeight() {
     return height;
 }

 @Override
 public double getArea() {
     return 2 * Math.PI * radius * (radius + height);
 }

 @Override
 public double getVolume() {
     return Math.PI * radius * radius * height;
 }

 @Override
 public int compareTo(GeometricObject obj) {
     if (obj instanceof Cylinder) {
         Cylinder other = (Cylinder) obj;
         if (this.getVolume() > other.getVolume()) {
             return 1;
         } else if (this.getVolume() < other.getVolume()) {
             return -1;
         } else {
             return 0;
         }
     }
     return super.compareTo(obj);
 }
}


