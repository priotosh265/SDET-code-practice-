import java.util.HashSet;

public class ListdownUniqNumbersFromArray {
    static void main(String[] args) {
        int[] numbers = {4, 2, 7, 5, 2, 9, 5, 5};
        HashSet<Integer> find = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            find.add(numbers[i]);
        }
        for (int i : find)
            System.out.println(i);

        //or print direct set
//        System.out.println(find);
    }
}
