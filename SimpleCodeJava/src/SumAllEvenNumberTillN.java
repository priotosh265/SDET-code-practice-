import java.util.Scanner;

public class SumAllEvenNumberTillN {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        for (int i = 0; i<=n ; i++) {
            if (i%2 == 0) {
                count = count+i;
            }
        }
        System.out.println(count);
    }
}
