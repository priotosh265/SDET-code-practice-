import java.util.Arrays;

public class BasicArray2 {
    //Linear search
    static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                index=i;
                break;
            }
        }
        System.out.println(index+1);
    }
}
