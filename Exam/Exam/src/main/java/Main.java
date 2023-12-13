public class Main
{
    public static void main(String[] args)
    {

        Diploma diploma = new Diploma("Maria");
        diploma.addCourse(new Course("Math", 7));
        diploma.addCourse(new Course("Danish", 10));
        diploma.addCourse(new Course("English", 12));

        System.out.println(diploma.toString());
        System.out.println(diploma.averageGrade());
    }

}
