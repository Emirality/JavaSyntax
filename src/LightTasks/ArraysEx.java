package LightTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = new int[]{2,8,12,3,1,29,0};
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).average().getAsDouble());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        System.out.println(DeleteNumber(list,1));

    }

    public static List<Integer> DeleteNumber(List<Integer> list, int number){
        List<Integer> myNewList = new ArrayList<>();

        for(Integer i : list){
            if (i != number){
                myNewList.add(i);
            }
        }
        return myNewList;
    }
}
