
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
   private int base;
   private String color;
   
   public secondShape(int base, int height, String color) {
       this.height = height;
       this.base = base;
       this.color = color;
   }
   
   public double getArea() {
       return 1/2 * base * height * 13;
   }
   
   public double getPerimeter() {
       return base * 15;
   }
   
   public String getColor() {
       return this.color;
   }
}
