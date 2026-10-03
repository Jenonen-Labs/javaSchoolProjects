import java.util.Scanner;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class Employee implements Serializable
{
    private String Fname;
    private String Lname;
    private float rate=30.0f;
    private float taxrate=0.2f;
    private int hours=45;
    private float gross=0.0f;
    private float tax=0.0f;
    private float net=0.0f;
    private float net_percent=0.0f;
    NumberFormat USD = NumberFormat.getCurrencyInstance(Locale.US);
    public Employee(String Fname, String Lname, float rate, int hours)
    {
        //When you see "this" in front of a variable, it's because it's wanting you to reference the field.
        this.Fname = Fname;
        this.Lname = Lname;
        this.rate = rate;
        this.hours = hours;
        this.taxrate = 0.2f;
        this.gross = 0.0f;
        this.tax = 0.0f;
        this.net = 0.0f;
        this.net_percent = 0.0f;
    }

    public String getName()
    {
        return Fname + " " + Lname;
    }
            
    public void menu(Scanner sc)
    {
        int input;

        do
        {
            System.out.println("1) Calculate Gross Pay");
            System.out.println("2) Calculate Tax");
            System.out.println("3) Calculate Net Pay");
            System.out.println("4) Calculate Net Percent");
            System.out.println("5) Display Employee");
            System.out.println("6) Go Back");

            while(!sc.hasNextInt())
            {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }

            input = sc.nextInt();

            if(input == 1)
            {
                computeGross();
                System.out.println("Gross Pay: " + USD.format(gross));
            }
            else if(input == 2)
            {
                computeTax();
                System.out.println("Tax: " + USD.format(tax));
            }
            else if(input == 3)
            {
                computeNet();
                System.out.println("Net Pay: " + USD.format(net));
            }
            else if(input == 4)
            {
                computeNetperc();
                System.out.println("Net Percent: " + net_percent + "%");
            }
            else if(input == 5)
            {
                displayEmployee();
            }
            else if(input == 6)
            {
                System.out.println("Returning...");
            }
            else
            {
                System.out.println("Invalid choice.");
            }

        } while(input != 6);
    }

    public void computeGross()
    {
        if(hours <= 40)
        {
            gross = hours * rate;
        }
        else
        {
            gross = (40*rate) + ((hours - 40) * rate * 1.5f);
        }
    }

    protected void computeTax()
    {
        tax = gross * taxrate;
    }

    protected void computeNet()
    {
        net = gross - tax;
    }

    protected void computeNetperc()
    {
        if(gross != 0)
        {
            net_percent = (net / gross) * 100;
        }
        else
        {
            net_percent = 0;
        }
    }

    protected void displayEmployee()
    {
        System.out.println("First Name: " + Fname);
        System.out.println("Last Name: " + Lname);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + USD.format(rate));
        System.out.println("Gross Pay: " + USD.format(gross));
        System.out.println("Tax: " + USD.format(tax));
        System.out.println("Net Pay: " + USD.format(net));
        System.out.println("Net Percent: " + net_percent + "%");
    }
}