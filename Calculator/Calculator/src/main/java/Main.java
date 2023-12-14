import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(4);
        System.out.println(calculator.getResult());
        calculator.subtract(2);
        System.out.println(calculator.getResult());
        calculator.clear();
        System.out.println(calculator.getResult());
        calculator.addDouble(new double []{1, 2, 3, 4});
        System.out.println(calculator.getResult());

    }
}
