import java.sql.SQLOutput;

public class Course
{
    private String courseName;
    private double grade;

    public Course(String courseName, int grade)
    {
        this.courseName=courseName;
        this.grade=grade;

        switch (grade)
        {
            case -3:
                System.out.println("-3");
                break;
            case 00:
                System.out.println("00");
                break;
            case 02:
                System.out.println("02");
                break;
            case 4:
                System.out.println("4");
            case 7:
                System.out.println("7");
                break;
            case 10:
                System.out.println("10");
                break;
            case 12:
                System.out.println("12");
            default:
                System.out.println("Not a grade");
        }
    }

    public String getCourseName()
    {
        return courseName;
    }

    public double getGrade()
    {

        return grade;
    }

    public String toString()
    {
        return getCourseName() +": " +  getGrade();
    }
}
