import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        GradeCalculator tg = new GradeCalculator();
        tg.grades();
    }

    public void grades() {
        int SumAPlus, SumA, SumB, SumC, SumD, SumF;
        SumAPlus = SumA = SumB = SumC = SumD = SumF = 0;
        
        Scanner sc = new Scanner(System.in);
        
        // 1. Priming the loop: Get the first input
        System.out.print("Enter student marks (0-100) or -99 to quit: ");
        int marks = sc.nextInt();

        // 2. The loop condition
        while (marks != -99) {
            switch (marks / 10) {
                case 10:
                    System.out.println("Grade: A+");
                    SumAPlus++;
                    break;
                case 9:
                    System.out.println("Grade: A");
                    SumA++;
                    break;
                case 8:
                    System.out.println("Grade: B");
                    SumB++;
                    break;
                case 7:
                    System.out.println("Grade: C");
                    SumC++;
                    break;
                case 6:
                    System.out.println("Grade: D");
                    SumD++;
                    break;
                default:
                    System.out.println("Grade: F");
                    SumF++;
                    break;
            }

            // 3. Get the next input inside the loop
            System.out.print("Enter another grade (-99 to quit): ");
            marks = sc.nextInt();
        }

        // 4. Output results after the loop finishes
        System.out.println("\n--- Final Results ---");
        System.out.println("The total number of A+'s is " + SumAPlus);
        System.out.println("The total number of A's is " + SumA);
        System.out.println("The total number of B's is " + SumB);
        System.out.println("The total number of C's is " + SumC);
        System.out.println("The total number of D's is " + SumD);
        System.out.println("The total number of F's is " + SumF);
        
        sc.close();
    }
}