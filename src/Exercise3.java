import java.util.Scanner;
public class Exercise3 {
   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Height  : ");
        double h = in.nextDouble() * 25.4;
        System.out.print("Width  : ");
        double w = in.nextDouble() * 25.4;
        double a = w * h;
        System.out.printf("\n%,.2f", a);
        System.out.print(" m^2.");
        in.close();
    }

}


