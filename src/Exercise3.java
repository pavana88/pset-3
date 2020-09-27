import java.util.Scanner;

    public class Exercise3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("width:");
            double width = input.nextDouble();

            System.out.print("height:");
            double height = input.nextDouble();

            System.out.println();
            String outputMessage = "m^2.";
            System.out.printf("%,.2f",  (height * width) );
            System.out.println(outputMessage);

            input.close();
        }
    }

