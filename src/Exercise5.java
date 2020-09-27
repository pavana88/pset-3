import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        int hwOne = input.nextInt();
        System.out.print("Homework 2 : ");
        int hwTwo = input.nextInt();
        System.out.print("Homework 3 : ");
        int hwThree = input.nextInt();

        System.out.print("Quiz 1 : ");
        int quizOne = input.nextInt();
        System.out.print("Quiz 2 : ");
        int quizTwo = input.nextInt();

        System.out.print("Test 1 : ");
        int testOne = input.nextInt();

        double avgGrade = 0.15 * (hwOne + hwTwo + hwThree)/3.0 + 0.35 * (quizOne + quizTwo)/2 + 0.50 * testOne;
        System.out.print("\n");
        System.out.printf("%.2f", avgGrade);
        System.out.println("%.");
    }
}