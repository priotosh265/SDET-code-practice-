import java.util.ArrayList;
import java.util.Scanner;

public class BasicArray3 {
    //Linear search
    static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            myNumbers.add(x);
        }
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}

