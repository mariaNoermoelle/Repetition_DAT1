public class Main
{
    public static void main(String[] args)
    {
        PasswordValidator pv = new PasswordValidator(6,20,1);
        System.out.println(pv.isValid("ghtkhdfd56"));
    }
}
