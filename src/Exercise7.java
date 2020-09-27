import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Salary :");
        double salary = in.nextDouble();
        System.out.print("401k :");
        double fouroOne = in.nextDouble();
        System.out.print("Federal:");
        double federal = in.nextDouble();
        System.out.print("State  :");
        double state = in.nextDouble();

        double twoWeek = salary / 24;
        double minusfouroOne = twoWeek * (fouroOne/100);
        twoWeek = twoWeek - minusfouroOne;
        double minusfederal = twoWeek * (federal/100);
        double minusState = twoWeek * (state/100);



        System.out.println();
        System.out.print("$");
        System.out.printf("%.2f", twoWeek- (minusfederal + minusState));
        System.out.print(".");
    }
}
