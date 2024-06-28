package Part2.Q4;

public abstract class GeometricObject implements Comparable<GeometricObject> {

 public abstract double getArea();
 public abstract double getVolume();

 @Override
 public int compareTo(GeometricObject obj) {
     if (this.getVolume() > obj.getVolume()) {
         return 1;
     } else if (this.getVolume() < obj.getVolume()) {
         return -1;
     } else {
         return 0;
     }
 }

 public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
     return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
 }
}
