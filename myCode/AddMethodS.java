import java.util.Scanner;
public class AddMethodS
{
    public static int add (int a, int b)
    {
        return a + b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int input = sc.nextInt();
        System.out.println("Please input a second number");
        int input2 = sc.nextInt();
        int result = add(input, input2);
        System.out.println("The sum is " + result);
        System.out.println(add(5,7));
    }    
}