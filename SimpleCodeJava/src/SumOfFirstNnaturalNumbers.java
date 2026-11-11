import java.util.Scanner;

public class SumOfFirstNnaturalNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum Of First N natural Numbers: " + sum);
    }
}
