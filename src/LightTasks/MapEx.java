package LightTasks;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,2,5,7,1};
        System.out.println(identicalElements(arr));
    }

    public static Map<Integer,Integer> identicalElements(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        return map;
    }
}
