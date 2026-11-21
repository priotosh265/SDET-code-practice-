import java.util.Arrays;

public class Find2ndLargestNO {
    static void main(String[] args) {
        int[] arr = {1,2,5,6,3,2};
        Arrays.sort(arr);
        System.out.println("Result: "+arr[arr.length-2]);
    }
}
