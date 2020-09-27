import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("width:");
        double width = input.nextDouble();

        System.out.print("height:");
        double height = input.nextDouble();

        System.out.println();
        String outputMessage = "cm.";
        System.out.printf("%,.2f", (( width * 2.00) + (height * 2.00 )) * 2.54 );
        System.out.println(outputMessage);

        input.close();
    }
}
