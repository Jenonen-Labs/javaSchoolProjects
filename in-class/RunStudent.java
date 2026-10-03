import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RunStudent
{
    //Student[] myStudents = {new Student(Joe, 70, 95), new Student(Joey, 70, 95)};

    //This makes an array of three null values.
    Student[] myStudents = new Student[3];

    public static void main(String[] args)
    {
        RunStudent rs = new RunStudent();
        rs.menu();
    }

    public void menu()
    {
        Scanner sc = new Scanner(System.in);
        int input;

        do
        {
            System.out.println("1) Populate Students");
            System.out.println("2) Find Students");
            System.out.println("3) Select Students");
            System.out.println("4) Show Students");
            System.out.println("5) Exit");

            //input = Integer.parseInt(sc.next()); Does the same thing as right below it.
            input = sc.nextInt();

            switch(input)
            {
                case 1:
                    populateStudents();
                    break;
                case 2:
                    findStudents();
                    break;
                case 3:
                    selectStudents();
                    break;
                case 4:
                    showStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        while(input != 5);
    }

    public void selectStudents()
{
    Scanner sc = new Scanner(System.in);
    int index;

    for(int i = 0; i < myStudents.length; i++)
    {
        if(myStudents[i] != null)
        {
            System.out.println(i + ") " + myStudents[i].getName());
        }
        else
        {
            System.out.println(i + ") [empty]");
        }
    }

    System.out.print("Enter student index: ");

    if(sc.hasNextInt())
    {
        index = sc.nextInt();

        if(index >= 0 && index < myStudents.length && myStudents[index] != null)
        {
            myStudents[index].menu();
        }
        else
        {
            System.out.println("Invalid selection.");
        }
    }
    else
    {
        System.out.println("Please enter a number like 0, 1, or 2.");
    }
}

    public void findStudents()
    {
        String tempName = "";
        int index = -1;

        System.out.println("Enter name to find:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            tempName = br.readLine();
        }
        catch(IOException ioe)
        {
            System.out.println("Something went wrong with your input name. Try again.");
            return;
        }

        for(int i = 0; i < myStudents.length; i++)
        {
            if(myStudents[i] != null && myStudents[i].getName().equalsIgnoreCase(tempName))
            {
                index = i;
                break;
            }
        }

        if(index != -1)
        {
            myStudents[index].menu();
        }
        else
        {
            System.out.println("Student not found. Please try again.");
        }
    }

    public void populateStudents()
    {
        String tempName;
        int tempExam1;
        int tempExam2;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < myStudents.length; i++)
        {
            if(myStudents[i] == null)
            {
                System.out.print("Please enter your name: ");
                tempName = sc.nextLine();

                System.out.print("Please enter your Exam 1 score: ");
                tempExam1 = Integer.parseInt(sc.nextLine());

                System.out.print("Please enter your Exam 2 score: ");
                tempExam2 = Integer.parseInt(sc.nextLine());

                myStudents[i] = new Student(tempName, tempExam1, tempExam2);
                //A break here would populate a student one at a time.
            }
        }
    }

    public void showStudents()
    {
        for(int i = 0; i < myStudents.length; i++)
        {
            if(myStudents[i] != null)
            {
                myStudents[i].menu();
                System.out.println();
            }
            else
            {
                System.out.println("Slot " + i + " is empty.");
            }
        }
    }
}