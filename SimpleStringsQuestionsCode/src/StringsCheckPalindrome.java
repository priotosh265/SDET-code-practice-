import java.util.Scanner;

public class StringsCheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i) + r;
        }
        if (r.equals(s)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}