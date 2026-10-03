/************************/
//My Methods Program
//Coded by Jonathan Wintemberg - 2026/03/10
/************************/
import java.util.Scanner;

public class MyMethods
{
    public void prodNoNegative()//
    {
        int input;
        int positiveCounter = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n====== Product No Negative ======");
        System.out.println("Please enter an integer. Negative entries will be ignored. (-99 to return to main menu): ");
            
        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
        input = sc.nextInt();
        
        while (input != -99)
        {
        
            if (input > 0)
            {
                System.out.println("\nResult = " + input + ", and this is positive.");
                positiveCounter++;
            }
            else
            {
                System.out.println("\n...");
            }
            System.out.println("\nEnter another integer (-99 to return to main menu): ");
               
        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }

            input = sc.nextInt();
        }
        System.out.println("\nTotal number of positives was: " + positiveCounter + "\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void findTwelve()//
    {
        int input;
        int twelveCounter = 0;
        
        System.out.println("\n====== Find Twelve ======");
        System.out.println("Please enter an integer. We will see if it is twelve (-99 to return to main menu): ");
        Scanner sc = new Scanner(System.in);
            
        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
        input = sc.nextInt();

        while (input != -99)
        {
            if (input == 12)
            {
                System.out.println("\nThis is " + input + "!");
                twelveCounter++;
            }
            else
            {
                System.out.println("\nThis is " + input + ", not 12...");
            }
            System.out.println("\nEnter another integer (-99 to return to main menu): ");

        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
            input = sc.nextInt();
        }
        System.out.println("\nTotal number of twelves was: " + twelveCounter + "\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void minMaxAvg()//
    {
        int input;
        int minMaxAvgCounter = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("\n====== Min, Max, Average Calculator ======");
        System.out.println("Please enter integers to find the Minimum, Maximum, and Average (-99 to return to main menu): ");
        Scanner sc = new Scanner(System.in);

        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
        input = sc.nextInt();

        while (input != -99)
        {
            //Update Sum and Count for Average
            sum = sum + input;
            minMaxAvgCounter++;

            //Update Max
            if (input > max)
            {
                max = input;
            }

            //Update Min
            if (input < min)
            {
                min = input;
            }

            System.out.println("Enter next integer (-99 to finish calculation): ");
        
        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
            input = sc.nextInt();
        }

        //Output results (only if at least one number was entered)
        if (minMaxAvgCounter > 0)
        {
            double average = (double) sum / minMaxAvgCounter; //Cast to double for decimals
            
            System.out.println("\nMinimum is: " + min);
            System.out.println("Maximum is: " + max);
            System.out.println("Average is: " + average + "\n");
        }
        else
        {
            System.out.println("\nNo numbers were entered. Returning to main menu...\n");
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void grades()//
    {
        // 1) Declare and initialize variables
        int input;
        int sumA = 0, sumAMinus = 0;
        int sumBPlus = 0, sumB = 0, sumBMinus = 0;
        int sumCPlus = 0, sumC = 0, sumCMinus = 0;
        int sumDPlus = 0, sumD = 0, sumDMinus = 0;
        int sumF = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n====== Find Grade Letter ======");
        System.out.println("Welcome to the UMSL Grading System. Please input your numeric grade (-99 to return to main menu): ");

        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
        input = sc.nextInt();

        while (input != -99)
            {
            if (input > 100 || (input < 0 && input != -99))
            {
                System.out.println("Invalid input. Please enter a score between 0 and 100.");//Handles out-of-bounds
                input = sc.nextInt();
            } 
            else if (input >= 90)
            {
                sumA++;
                System.out.println(input + " is an A.");
            } else if (input >= 87)
            {
                sumAMinus++;
                System.out.println(input + " is an A-.");
            } else if (input >= 83)
            {
                sumBPlus++;
                System.out.println(input + " is a B+.");
            } else if (input >= 80)
            {
                sumB++;
                System.out.println(input + " is a B.");
            } else if (input >= 77)
            {
                sumBMinus++;
                System.out.println(input + " is a B-.");
            } else if (input >= 73)
            {
                sumCPlus++;
                System.out.println(input + " is a C+.");
            } else if (input >= 70)
            {
                sumC++;
                System.out.println(input + " is a C.");
            } else if (input >= 67)
            {
                sumCMinus++;
                System.out.println(input + " is a C-.");
            } else if (input >= 63)
            {
                sumDPlus++;
                System.out.println(input + " is a D+.");
            } else if (input >= 60)
            {
                sumD++;
                System.out.println(input + " is a D.");
            } else if (input >= 57)
            {
                sumDMinus++;
                System.out.println(input + " is a D-.");
            } else
            {
                sumF++;
                System.out.println(input + " is an F.");
            }

            System.out.println("\nEnter another grade (-99 to return to main menu): ");
        while(!sc.hasNextInt())
            {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        
            input = sc.nextInt();
        }
            System.out.println("\n---- Total Counts ----");
            System.out.println("A: " + sumA + " | A-: " + sumAMinus);
            System.out.println("B+: " + sumBPlus + " | B: " + sumB + " | B-: " + sumBMinus);
            System.out.println("C+: " + sumCPlus + " | C: " + sumC + " | C-: " + sumCMinus);
            System.out.println("D+: " + sumDPlus + " | D: " + sumD + " | D-: " + sumDMinus);
            System.out.println("F: " + sumF + "\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void colorMixer()//
    {
        int input;
        int firstColor = 0;
        int secondColor = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n====== Color Mixer ======");
        System.out.println("Choose two colors and see what they mix into! (-99 to return to main menu): ");
        System.out.println("1) Red");
        System.out.println("2) Blue");
        System.out.println("3) Yellow");
        System.out.println("4) Green\n");

        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
        input = sc.nextInt();
        if (input == -99) return;//"return" goes back to a previous menu

        while (input < 1 || input > 4)
        {
            System.out.println("Invalid integer. Please enter 1, 2, 3, or 4.");
        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
            input = sc.nextInt();
        }

        while (firstColor == 0)
        {
            if (input == 1)
            {
                System.out.println("You chose Red.");
                firstColor = input;
            }
            else if (input == 2)
            {
                System.out.println("You chose Blue.");
                firstColor = input;
            }
            else if (input == 3)
            {
                System.out.println("You chose Yellow.");
                firstColor = input;
            }
            else if (input == 4)
            {
                System.out.println("You chose Green.");
                firstColor = input;
            }
        }
            System.out.println("\nEnter another color (-99 to return to main menu): ");
        
        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        
            input = sc.nextInt();
            if (input == -99) return;

        while (secondColor == 0)
        {
            if (input == 1)
            {
                System.out.println("You chose Red.");
                secondColor = input;
            }
            else if (input == 2)
            {
                System.out.println("You chose Blue.");
                secondColor = input;
            }
            else if (input == 3)
            {
                System.out.println("You chose Yellow.");
                secondColor = input;
            }
            else if (input == 4)
            {
                System.out.println("You chose Green.");
                secondColor = input;
            }
        }
            if ((firstColor == 1 && secondColor == 2) || (firstColor == 2 && secondColor == 1))
            {
                System.out.println("\nYour mixed color is Purple!\n");
            }
            else if ((firstColor == 1 && secondColor == 3) || (firstColor == 3 && secondColor == 1))
            {
                System.out.println("\nYour mixed color is Orange!\n");
            }
            else if ((firstColor == 1 && secondColor == 4) || (firstColor == 4 && secondColor == 1))
            {
                System.out.println("\nYour mixed color is Brown!\n");
            }
            else if ((firstColor == 2 && secondColor == 3) || (firstColor == 3 && secondColor == 2))
            {
                System.out.println("\nYour mixed color is Green!\n");
            }
            else if ((firstColor == 2 && secondColor == 4) || (firstColor == 4 && secondColor == 2))
            {
                System.out.println("\nYour mixed color is Cyan!\n");
            }
            else if ((firstColor == 3 && secondColor == 4) || (firstColor == 4 && secondColor == 3))
            {
                System.out.println("\nYour mixed color is Chartreuse!\n");
            }
            else
            {
                System.out.println("\nThose colors don't mix into a new color.\n");
            }
            sc.close();
    }
}