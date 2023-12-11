public class Circle implements Shape
{
   private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        double area = 0;
        area = Math.PI * radius;
        return area;
    }
}
