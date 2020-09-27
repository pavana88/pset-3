import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount : ");
        double Amount = input.nextDouble();

        int Quarters = (int) ((Amount-Amount % 0.25)/0.25);
        Amount -= (Quarters*0.25);

        int Dimes = (int) ((Amount-Amount % 0.10)/0.10);

        Amount -= (Dimes*0.10);
        int Nickels = (int) ((Amount-Amount % 0.05)/0.050);

        Amount -= (Nickels*0.050);
        int Pennies = (int) (Amount * 100);


        System.out.println("Quarters : " + Quarters);
        System.out.println("Nickels : " + Nickels);
        System.out.println("Dimes : " + Dimes);
        System.out.println("Pennies : " + Pennies);
    }
}