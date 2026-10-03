import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Payroll
{

    private Employee[] employees;
    private int count = 0;
    private boolean employeeLoaded = false;
    public static void main(String[] args)
    {
        Payroll p = new Payroll();
        p.menu();
    }
    
    void menu()
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("==== PAYROLL MENU ====");
            System.out.println("1) Populate Employees");
            System.out.println("2) Select Employee");
            System.out.println("3) Save Employees");
            System.out.println("4) Load Employees");
            System.out.println("5) Exit");

            while(!sc.hasNextInt())
            {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }

            choice = sc.nextInt();

            switch(choice)
            {
            case 1:
                populateEmployees(sc);
                break;
            case 2:
                selectEmployee(sc);
                break;
            case 3:
                saveEmployees();
                break;
            case 4:
                loadEmployees();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice.");
            } 

        } while(choice != 5);
    }

    void populateEmployees(Scanner sc)
    {
        if(employeeLoaded || (employees != null && count > 0))
        {
            System.out.println("Employees already loaded from file. Cannot repopulate.");
            return;
        }

        int size = 0;

        while (true)
        {
            System.out.println("How many employees? ");

            if (sc.hasNextInt())
            {
                size = sc.nextInt();
                sc.nextLine();
                if (size > 0)
                {
                    break;
                }
                else 
                {
                    System.out.println("Number must be positive.");
                }
            }
            else
            {
                System.out.println("Invalid input. Enter a number.");
                sc.next();
            }
        }

    employees = new Employee[size];

    for(int i=0; i<size; i++)
        {
            
            System.out.println("Enter first name: ");
            String fname = sc.nextLine();

            System.out.println("Enter last name: ");
            String lname = sc.nextLine();

            float rate = 0;

            while (true)
            {
                System.out.println("Enter rate: ");
                if (sc.hasNextFloat())
                {
                    rate = sc.nextFloat();
                    sc.nextLine();
                    if (rate > 0)
                    {
                        break;
                    }
                    else 
                    {
                        System.out.println("Rate must be positive.");
                    }
                }
                else
                {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next();
                }
            }

            int hours = 0;

            while (true)
            {
                System.out.println("Enter hours: ");
                if (sc.hasNextInt())
                {
                    hours = sc.nextInt();
                    sc.nextLine();
                    if (hours > 0)
                    {
                        break;
                    }
                    else 
                    {
                        System.out.println("Hours cannot be negative.");
                    }
                }
                else
                {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next();
                }
                sc.next();
            }

            employees[i] = new Employee(fname, lname, rate, hours);
            count++;
        }
        System.out.println("Employees successfully created.");
    }

    public void selectEmployee(Scanner sc)
    {
        if(employees == null || count == 0)
        {
            System.out.println("No employees loaded.");
            return;
        }

        for(int i = 0; i < count; i++)
        {
            System.out.println(i + ") " + employees[i].getName());
        }

        System.out.print("Select employee: ");
        int index = 0;

        while (true)
        {
            if (sc.hasNextInt())
            {
                index = sc.nextInt();
                sc.nextLine();
                if (index > -1)
                {
                    break;
                }
                else 
                {
                    System.out.println("Number invalid.");
                }
            }
            else
            {
                System.out.println("Invalid input. Enter a number.");
                sc.next();
            }
        }

        if(index >= 0 && index < count)
        {
            employees[index].menu(sc);
        }
        else
        {
            System.out.println("Invalid selection.");
        }
    }

    public void saveEmployees()
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("employees.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(employees);
            oos.flush();
            fos.close();
            System.out.println("Employees saved successfully.");
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Error saving: " + e.getMessage());
        }
        catch(IOException ioe)
        {
            System.err.println("Error saving: " + ioe.getMessage());
        }
    }

    void loadEmployees()
    {
        try
        {
            FileInputStream fis = new FileInputStream("employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees = (Employee[]) ois.readObject();

            if (employees == null)
            {
            System.out.println("No employees saved in file.");
            count = 0;
            employeeLoaded = false;
            } 
            else
            {
            count = employees.length;
            employeeLoaded = true;
            System.out.println("Employees loaded successfully.");
            }
            ois.close();
        }
            
        catch (IOException ioe)
        {
            System.err.println(ioe);
        }

        catch (ClassNotFoundException cnfe)
        {
            System.err.println(cnfe);
        }
    }
}