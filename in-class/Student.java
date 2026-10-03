public class Student
{
    //When a variable is private, the only methods that can change them must be public, be a constructor or getter/setter.
    private String name;
    private int exam1;
    private int exam2;
    private double myAvg;
    private char lg;

    //Constructors create objects on the heap. They always have the same name as the class. They also have no return type.
    //The only way to change private fields is to set them through contructors OR getters and setters.

    //Default constructor. 
    public Student()
    {
        name = "Jane Doe";
        exam1 = 75;
        exam2 = 75;
    }

    //Parameterized constructor. This limits a method that calls "Student" to the parameters listed in this method.
    //Using both types of constructors 'overloads' them, meaning we can have a class that has multiple methods with the same name.

    /*For example, a class can define both 'add(int a, int b);' and 'add(double a, double b);'. The compiler automatically selects the
    correct version based on whether integer or floating-point arguments are provided.*/

    public Student(String arg_name)
    {
        name = arg_name; 
    }

    public Student(String name, int exam1, int exam2)
    {
        //When you see "this" in front of a variable, it's because it's wanting you to reference the field.
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
    }

    //Getters and setters have return types. They are also known as accessor methods - particular types of instance methods which give you
    //access to private fields.
    //This is a getter, because it "gets", or returns something.
    public int getExam2()
    {
        return exam2;
    }

    //This is a setter, because it "sets" exam2 by passing in an int type.
    //Setters are also known as mutators, because they can modify private variables.
    public void setExam2(int exam2)
    {
        this.exam2 = exam2;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getExam1()
    {
        return exam1;
    }

    public void setExam1(int exam1)
    {
        this.exam1 = exam1;
    }

    //This is an instance method. They are meant to be called from an instance of the class.
    public void menu()
    {
        calcAvg();
        calcLetterGrade();
        displayStudent();
    }

    //Since "displayStudent" is inside of the class "Student", it has access to private fields.
    public void displayStudent()
    {
        System.out.println("Student: " + getName());
        System.out.println("Exam 1: " + getExam1());
        System.out.println("Exam 2: " + getExam2());
        System.out.println("Average: " + getAvg());
        System.out.println("Letter Grade: " + lg);
    }

    public void calcAvg()
    {
        myAvg = (getExam1() + getExam2()) / 2.0;
    }

    public double getAvg()
    {
        return myAvg;
    }

    public void calcLetterGrade()
    {
        if(myAvg >= 90)
        {
            lg = 'A';
        }
        else if(myAvg >= 70)
        {
            lg = 'B';
        }
        else if(myAvg >= 50)
        {
            lg = 'C';
        }
        else if(myAvg >= 35)
        {
            lg = 'D';
        }
        else
        {
            lg = 'F';
        }
    }
}