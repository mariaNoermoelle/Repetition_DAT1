public class Course
{
    private String courseName;
    private double grade;

    public Course(String courseName, int grade)
    {
        this.courseName=courseName;
        this.grade=grade;
    }

    public String getCourseName()
    {
        return courseName;
    }

/*   public boolean gradeCheck()
    {

        int grade = 0;
        if(grade == 12)
        {
            System.out.println("well done");
        }
        return grade;
    }
 */
    public double getGrade()
    {
        return grade;
    }

    public String toString()
    {
        return getCourseName() +": " +  getGrade();
    }
}
