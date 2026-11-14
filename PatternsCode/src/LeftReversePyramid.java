public class LeftReversePyramid {
    static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int j = 5; j > 0; j--) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
output
    *
   **
  ***
 ****
Another approach
Instead of using if else you can also use 2 for loops inside main loop
*/

