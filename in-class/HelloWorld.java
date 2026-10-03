import java.util.Scanner;
public class HelloWorld
{
    
    int x = 10;
    int y = 20;
    int z;
    //static Scanner sc = new Scanner(System.in);//intake method

        public static void main(String[] args)
        {
            System.out.println("Hello World!");//variables like "x" and "format" will be automatically generated
            HelloWorld hw = new HelloWorld();//this is an instance. hw is the reference.
            //When you see new, you are creating a new object on the heap.
            //hw.sum();
            //hw.difference();
            //hw.product();
            //hw.quotient();
            //hw.remainder();
            hw.menu();
            // z = x + y;
            // System.out.println("sum is: " + z);

            // z = x - y;
            // System.out.println("difference is: " + z);

            // z = x / y;
            // System.out.println("quotient is: " + z);

            // z = x * y;
            // System.out.println("product is: " + z);

            // z = x % y;
            // System.out.println("remainder is: " + z);
            //sc.close();
        }

        public void menu()
        {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);// out of scope, so you can call the same scanner
            int input;
            do
            {
                System.out.println("1) Sum");
                System.out.println("2) Difference");
                System.out.println("3) Product");
                System.out.println("4) Quotient");
                System.out.println("5) Remainder");
                System.out.println("6) Exit");
                input = sc.nextInt();
                if(input == 1)
                {
                   sum(); 
                }
                if(input == 2)
                {
                    difference();
                }
                if(input == 3)
                {
                   product(); 
                }
                if(input == 4)
                {
                    quotient();
                }
                if(input == 5)
                {
                    remainder(); 
                }
            }while(input != 6);
        }
        public void getInput()
        {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);//intake method
            System.out.println("Enter a value for x: ");
            x = sc.nextInt();
            System.out.println("Enter a value for y: ");
            y = sc.nextInt();
        }
        public void sum()
        {
            getInput();
            z = x + y;
            System.out.println("sum is: " + z);
        }
        public void difference()
        {
            getInput();
            z = x - y;
            System.out.println("difference is: " + z);
        }
        public void quotient()
        {
            getInput();
            z = x / y;
            System.out.println("quotient is: " + z);
        }
        public void product()
        {
            getInput();
            z = x * y;
            System.out.println("product is: " + z);
        }
        public void remainder()
        {
            getInput();
            z = x % y;
            System.out.println("remainder is: " + z);
        }
}

// #include <stdio.h>

// int main void()
// {
//     int x;
//     printf("fneswf");
//     scanf("%d", &x);
//     printf(The value is %d\n", x);
//     return 0;
// }