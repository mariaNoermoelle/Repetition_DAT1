public class Main
{
    public static void main(String[] args)
    {
        Shapes shapes = new Shapes();
     Square square = new Square(5.0, 3.0);
     Circle circle = new Circle(4.0);


     shapes.addShape(square);
     shapes.addShape(circle);


        System.out.println(square.calculateArea());
        System.out.println(circle.calculateArea());
        System.out.println(shapes.totalArea());
    }
}
