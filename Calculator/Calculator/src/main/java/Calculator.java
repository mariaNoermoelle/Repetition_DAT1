public class Calculator
{
    private double result;

    public void add(double x)
    {
        result += x;
    }

    public void subtract(double x)
    {
        result -= x;
    }

    public void clear()
    {
        result = 0;
    }

    public void addDouble(double[] numbers)
    {
        double sum = 0;
        for(double i = 0; i < numbers.length; i++) {
            sum += numbers[(int)i];
        }
        result += sum;
    }


    public double getResult()
    {
        return result;
    }
}
