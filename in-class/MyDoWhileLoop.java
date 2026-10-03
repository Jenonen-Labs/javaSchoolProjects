import java.util.Scanner;
public class MyDoWhileLoop
{
    public static void main(String[] args)
    {
        MyDoWhileLoop mdwl = new MyDoWhileLoop();
        System.out.println("The average is: " + mdwl.average());
    }

    public float average()
    {
        Scanner sc = new Scanner(System.in);
        int num = 0, count = 0, total = 0;
        do
        {
            System.out.println("Enter a whole number, and -99 to quit: ");
            num = sc.nextInt();

            if(num != -99)
            {
                count++;
                total += num;
            }
        }
        while (num != -99);

        if(count == 0)
        {
            System.out.println("No numbers were entered.");
            return 0;
        }

        float average = (float) total/count;
        System.out.println("You keyed in " + count + " numbers \n");
        return(average);
    }
    
    
}
