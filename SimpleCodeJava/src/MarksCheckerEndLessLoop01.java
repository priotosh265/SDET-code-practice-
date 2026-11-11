import java.util.Scanner;

public class MarksCheckerEndLessLoop01 {
    static void main(String[] args) {
//        Menu driven program. The user can enter 2 numbers, either 1 or 0.
//        If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
//        If they enter 0 then stop.
//        If he/ she scores :
//        Marks >=90 -> print “This is Good”
//        89 >= Marks >= 60 -> print “This is also Good”
//        59 >= Marks >= 0 -> print “This is Good as well”
//        Because marks don’t matter but our effort does.

        //Marks checker fail or pass
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            IO.println("Marks Checker\n Press 1 for check\n Press 0 for exit...");
            n = scanner.nextInt();
            if (n == 1) {
                System.out.println("enter score:");
                int score = scanner.nextInt();
                if (score >= 90 && score <= 100) {
                    System.out.println("this is good");
                } else if (score >= 60 && score <= 89) {
                    IO.println("This is also Good");
                } else if (score >= 0 && score <= 59) {
                    IO.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } else if (n != 0) {
                System.out.println("Invalid choice! Please enter either 1 or 0.");
            }
        } while (n != 0);
        System.out.println("Stop working exit");
    }
}
