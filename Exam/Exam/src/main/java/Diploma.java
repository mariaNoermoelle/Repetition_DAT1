import java.util.ArrayList;

public class Diploma
{
    private String studentName;
    private ArrayList<Course> courses = new ArrayList<>();

    public Diploma(String studentName)
    {
        this.studentName=studentName;
    }

    public void addCourse(Course course)
    {
        courses.add(course);
    }

    public double averageGrade()
    {
        double average = 0;
        for(Course course : courses)
        {
            average = average + course.getGrade() / courses.size();
        }
        return average;
    }


    public String toString()
    {
        String listOfCourses = courses.toString();
        return studentName + listOfCourses;
    }

}
