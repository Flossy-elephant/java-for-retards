import static utils.print.*;
 
class Shape{

  public double calculateArea(double length,double breadth){
    return length * breadth;
  }

  public double calculateArea(double radius){
    return Math.PI * radius  * radius;
  }

  public double calculateArea(float base,float height){
    return 0.5 * height *base;
  }

  public int calculateArea(int side){
    return 4 * side;
  }

}


public class ShapeDemo{
  public static void main(String[] args) {
    Shape shape = new Shape();

    ln("area of rectangle: " + shape.calculateArea(0.5,2));
    ln("area of triangle: " + shape.calculateArea(1.2f,2.4f));
    ln("area of circle: " + shape.calculateArea(0.8));
    ln("area of square: " + shape.calculateArea(5));
    
  }
}