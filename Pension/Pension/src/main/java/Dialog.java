import java.util.Scanner;

public class Dialog
{
    int currentYear;

    public Dialog(int currentYear)
    {
        this.currentYear= currentYear;
    }

    public void getYearOfBirth()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your birth year below: ");
        int birthYear = scan.nextInt();
        //getYearsToRetirement(birthYear);
        System.out.println("You will retire in " + getYearsToRetirement(birthYear) + " years.");
    }

    public int getYearsToRetirement(int birthYear)
    {
        int retirementAge = 67;
        int yearsToRetirement = retirementAge+birthYear;
        yearsToRetirement = yearsToRetirement - currentYear;
        if(yearsToRetirement > 9999) {
            System.out.println("Too many digets.");
        }else if(yearsToRetirement <=0) {
            System.out.println("You are not that old.");
        }else if (yearsToRetirement>currentYear){
            System.out.println("This is not possible.");
        }
        return yearsToRetirement;
    }
}
