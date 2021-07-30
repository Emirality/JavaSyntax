package Practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {62,34,643,21,9,26,31,68,42,7};
        BubbleSort(arr);
    }
    // iterations i = 9
    // iter1: 34 62 643 21 9 26 31 68 42 7
    // iter2: 34 62 643 21 9 26 31 68 42 7
    // iter3: 34 62 21 643 9 26 31 68 42 7
    // iter4: 34 62 21 9 643 26 31 68 42 7
    // iter5: 34 62 21 9 26 643 31 68 42 7
    // iter6: 34 62 21 9 26 31 643 68 42 7
    // iter7: 34 62 21 9 26 31 68 643 42 7
    // iter8: 34 62 21 9 26 31 68 42 643 7
    // iter9: 34 62 21 9 26 31 68 42 7 643
    // for loop is ending, isSorted == false, then while repeat.

    public static void BubbleSort(int[] arr){

        boolean isSorted = false;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
       }
        System.out.println(Arrays.toString(arr));
    }
}
