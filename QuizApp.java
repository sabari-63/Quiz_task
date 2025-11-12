//Small Quiz App
import java.util.Scanner;
public class QuizApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("1). Which is the Capital of Karnataka?");
        System.out.println("a Bengalore b Davanagere c Belagavi d Mysore");
        String ans1 = sc.nextLine();

        if (ans1.equalsIgnoreCase("a") || ans1.equalsIgnoreCase("Bengalore")) {
            score++;
        }
        System.out.println("2). Which Programming Language is used JVM?");
        System.out.println("a Python b C++ c Java d C");
        String ans2 = sc.nextLine();

        if (ans2.equalsIgnoreCase("c") || ans2.equalsIgnoreCase("Java")) {
            score++;
        }

        System.out.println("\nYour Total Score is: " + score+"/2");
        sc.close();
    }
}