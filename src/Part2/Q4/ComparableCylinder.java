package Part2.Q4;

public class ComparableCylinder extends Cylinder implements Comparable<GeometricObject> {

 public ComparableCylinder(double radius, double height) {
     super(radius, height);
 }

 @Override
 public int compareTo(GeometricObject obj) {
     if (obj instanceof ComparableCylinder) {
         ComparableCylinder other = (ComparableCylinder) obj;
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
