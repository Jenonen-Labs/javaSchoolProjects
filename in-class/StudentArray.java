import java.util.Scanner;
public class StudentArray 
{
    public static void main(String[] args)
    {
        String id;
        float ex1, ex2;
        Scanner sc = new Scanner(System.in);
        StudentArrayMethods[] sarray = new StudentArrayMethods[3];

        for(int i=0;i<sarray.length;i++)
        {
            System.out.println("Enter ID#: ");
            id = sc.next();
            System.out.println("Enter Exam 1: ");
            ex1 = sc.nextFloat();
            System.out.println("Enter Exam 2: ");
            ex2 = sc.nextFloat();

            sarray[i] = new StudentArrayMethods();
            sarray[i].setID(id);
            sarray[i].setExam1(ex1);
            sarray[i].setExam2(ex2);
        }

        for(int i=0;i<sarray.length; i++)
        {
            sarray[i].showAll();
        }
    }    
}
