public class Main
{
    public static void main(String[] args)
    {
        PasswordValidator pv = new PasswordValidator(6,20,true, false);
        System.out.println(pv.isValid("ghthdkjff44d"));
    }
}
