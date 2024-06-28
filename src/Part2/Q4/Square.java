package Part2.Q4;

public class Square extends GeometricObject implements Colorable {
 @Override
 public double getArea() {
     return 0;
 }

 @Override
 public double getVolume() {
     return 0;
 }

 @Override
 public void howToColor() {
     System.out.println("Color all four sides of the square.");
 }
}

