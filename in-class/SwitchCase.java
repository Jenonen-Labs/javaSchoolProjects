import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase fwsc = new SwitchCase();
        int printFloor = fwsc.whichFloor();
        
        if (printFloor == -99) {
            System.out.println("Invalid telephone number."); 
        } else {
            System.out.println("This number is on floor " + printFloor);
        }
    }

    public int whichFloor() {
        Scanner sc = new Scanner(System.in);
        int floor = 0;

        System.out.println("Please enter an extension number: ");
        int telephone_number = sc.nextInt();

        switch (telephone_number) {
            case 6279:
            case 6127:
                System.out.println("This is on the 2nd floor of CCB.");
                floor = 2;
                break;
            case 6520:
                System.out.println("This is on the 3rd floor of CCB.");
                floor = 3;
                break;
            default:
                floor = -99;
        }
        return floor;
    }
}