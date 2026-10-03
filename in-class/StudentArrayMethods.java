public class StudentArrayMethods
{
    private String ID;
    private float Exam1;
    private float Exam2;

    public void setID(String s)
    {
        ID = s;
    }

    public void setExam1(float e1)
    {
        Exam1 = e1;
    }

    public void setExam2(float e2)
    {
        Exam2 = e2;
    }

    public void showAll()
    {
        System.out.println();
        System.out.println("Student ID: " + ID);
        System.out.println("Exam 1: " + Exam1);
        System.out.println("Exam 2: " + Exam2);
        System.out.println();
    }
}
