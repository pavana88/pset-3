import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit  : ");
        double fahrenheit = in.nextDouble();
        double celsius = (fahrenheit - 32) * .56;
        double kelvin = celsius+273.15;

        System.out.printf("Celsius   :  %.2f\n", celsius);
        System.out.printf("Kelvin    :  %.2f\n", kelvin);
        in.close();
    }

}
