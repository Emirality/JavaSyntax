package Practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {62,34,643,21,9,26,31,68,42,7};
        findMinWithStream(arr);
        findMin(arr);

    }

    public static void findMinWithStream(int[] arr){
        OptionalInt min = Arrays.stream(arr).min();
        System.out.println(min.isPresent() ? min.getAsInt() : "null");
    }
    public static void findMin(int[] arr){
        int minElement = arr[0];
        for (int j : arr) {
            if (j < minElement) {
                minElement = j;
            }
        }
        System.out.println(minElement);
    }
}
