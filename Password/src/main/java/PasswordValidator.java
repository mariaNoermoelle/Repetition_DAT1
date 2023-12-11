public class PasswordValidator
{
    private int minLength;
    private int maxLength;
    private boolean numbersRequired;
    private boolean upperCase;

    public PasswordValidator(int minLength, int maxLength, boolean numbersRequired, boolean upperCase)
    {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
        this.upperCase = upperCase;
    }

    public boolean isValid(String password) {
        if (password.length() >= minLength && password.length() <= maxLength) {
           for(int i =0; i<password.length(); i++)
            if(Character.isDigit(password.charAt(i))==numbersRequired){
                for(int j = 0; j<password.length(); j++) {
                    if (Character.isUpperCase(password.charAt(j)) == upperCase) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
