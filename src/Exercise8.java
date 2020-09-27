import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Students : ");
        int studTotal= input.nextInt();
        System.out.print("Teachers : ");
        int teachTotal= input.nextInt();
        System.out.print("Capacity : ");
        int busCap = input.nextInt();

        int busNumber = (studTotal + teachTotal + busCap -1) / busCap;
        int busOverflow = (studTotal + teachTotal)% busCap;

        System.out.printf("\n");
        System.out.print("Buses required      : " + busNumber);
        System.out.print("\nOverflow passengers : " + busOverflow);
    }
}
