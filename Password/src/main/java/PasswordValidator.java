public class PasswordValidator
{
    private int minLength;
    private int maxLength;
    private int numbersRequired;

    public PasswordValidator(int minLength, int maxLength, int numbersRequired)
    {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public boolean isValid(String password)
    {
        if((password.length()>minLength && (password.length()<maxLength)))
        {
            if(Character.isDigit(numbersRequired))
            {
                return true;
            }
        }
        return false;
    }
}
