import java.util.Arrays;
import java.util.Scanner;

public class ArrayQAinQ {
    static void main(String[] args) {
        int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(arr, (a,b)->a[0]-b[0]);

        int [][] result = new int[arr.length][2];
        int index=0;

        result[0] = arr[0];
        for (int i =0; i <arr.length; i++) {
            if (arr[i][0]<=result[index][1]) {
                result[index][1]= Math.max(result[index][1], arr[i][1]);
            }
            else {
                index++;
                result[index] = arr[i];
            }
        }
        for (int i = 0; i <=index; i++) {
            System.out.println("["+result[i][0]+", "+result[i][1]+"]");
        }
    }
}
