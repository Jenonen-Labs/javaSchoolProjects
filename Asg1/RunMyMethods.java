/************************/
//Run My Methods Program
//Coded by Jonathan Wintemberg - 2026/03/10
/************************/
import java.util.*;
import javax.swing.JOptionPane;
public class RunMyMethods
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
        {
            RunMyMethods rmm = new RunMyMethods();
            rmm.menu();
        }
        public void menu()
        {
            int input;
            MyMethods mm = new MyMethods();//We need this to communicate with the "MyMethods" file.
            String first_name;
            first_name = JOptionPane.showInputDialog("First name");
            do
            {
                System.out.println("Welcome, " + first_name + "!\n");
                System.out.println("====== Main Menu ======");
                System.out.println("1) No Negative Method");
                System.out.println("2) Find Twelve");
                System.out.println("3) Min Max Avg");
                System.out.println("4) Grades");
                System.out.println("5) Color Mixer");
                System.out.println("-99) Exit\n");

                while(!sc.hasNextInt())
                {
                    System.out.println("Invalid input. Please enter a number.\n");
                    sc.next();
                }

                input = sc.nextInt();

                if(input == 1)
                {
                    mm.prodNoNegative();
                }
                else if(input == 2)
                {
                    mm.findTwelve();
                }
                else if(input == 3)
                {
                    mm.minMaxAvg();
                }
                else if(input == 4)
                {
                    mm.grades();
                }
                else if(input == 5)
                {
                    mm.colorMixer();
                }
                else if(input == -99)
                {
                System.out.println("Goodbye, " + first_name + "!\n");
                }
                else
                {
                    System.out.println("Invalid choice. Please choose 1, 2, 3, 4, or 5.\n");
                }
            } while(input != -99);
        }
    }