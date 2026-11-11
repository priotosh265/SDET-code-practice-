import java.util.Scanner;

public class BasicCalculatorOfTwoNumbers {
    //Calculate result according to the operation given and display it to the user.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String calc = scanner.next();
        switch (calc){
            case "add" :
                System.out.println(a+b);
                break;
            case "sub" :
                System.out.println(a-b);
                break;
            case "multi" :
                System.out.println(a*b);
                break;
            case "div" :
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case "mod" :
                if (b != 0) {
                    System.out.println(a % b);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default :
                System.out.println("enter Validate function");
        }
    }
}
