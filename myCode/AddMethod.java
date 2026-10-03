import java.util.Scanner;
public class AddMethod
{
    public int add (int a, int b)
    {
        return a + b;
    }
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
        System.out.println("Please input a number");
        int input = sc.nextInt();
        System.out.println("Please input a second number");
        int input2 = sc.nextInt();
        AddMethod am = new AddMethod();
        int result = am.add(input, input2);
        System.out.println("The sum is " + result);
        System.out.println(am.add(4,7));
        }
    }    
}