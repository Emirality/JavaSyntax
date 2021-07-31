package Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {62,34,643,21,9,26,31,68,42,7};

        //iter1: index=9;
        for (int i = 0; i < arr.length; i++) {
            int index = min(arr,i);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static int min(int[] arr, int startFrom){
        int minimal = arr[startFrom];
        int minimalIndex = startFrom;
        for (int i = startFrom+1; i < arr.length; i++) {
            if (arr[i]<minimal){
                minimal = arr[i];
                minimalIndex = i;
            }
        }
        return minimalIndex;
    }
}
