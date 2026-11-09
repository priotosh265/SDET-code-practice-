import java.util.Scanner;

public class CheckNoOddOrEven {
    public static void main(String[] args) {
        //check odd even number
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2 == 0) {
            System.out.println("EVEN number");
        } else {
            System.out.println("ODD number");
        }
    }
}
