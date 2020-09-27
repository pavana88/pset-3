import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wage : ");
        double wage = input.nextDouble();

        System.out.println("Monday : ");
        double mon = input.nextDouble();
        System.out.println("Tuesday : ");
        double tues = input.nextDouble();
        System.out.println("Wednesday : ");
        double wed = input.nextDouble();
        System.out.println("Thursday : ");
        double thurs = input.nextDouble();
        System.out.println("Friday : ");
        double fri = input.nextDouble();
        System.out.println("Saturday : ");
        double sat = input.nextDouble();
        System.out.println("Sunday : ");
        double sun = input.nextDouble();

        double totHours = mon + tues + wed + thurs + fri + sat + sun;
        double salary = totHours * wage;
        System.out.printf("%n$%,.2f.", salary);

    }
}
