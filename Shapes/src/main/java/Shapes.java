import java.util.ArrayList;

public class Shapes
{

        private ArrayList<Shape> shapes = new ArrayList<>();

        public void addShape (Shape shape)
        {
            shapes.add(shape);
        }

        public double totalArea ()
        {
            double sum = 0;
            for (Shape shape : shapes) {
                sum += shape.calculateArea();
            }
            return sum;

        }
    }
