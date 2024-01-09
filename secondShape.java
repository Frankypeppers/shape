
/**
 * Write a description of class secondShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class secondShape implements Shape
{
   //15 sides
   
   private int height;
   private int sideLength;
   private String color;
   
   public secondShape(int base, int height, String color) {
       this.sideLength = sideLength;
       this.color = color;
   }
   
   public double getArea() {
       //area is A = (15/4) * (s)^2 (pi/15)
       return 15/4 * (sideLength
   }
   
   public double getPerimeter() {
       return sideLength * 15;
   }
   
   public String getColor() {
       return this.color;
   }
}
