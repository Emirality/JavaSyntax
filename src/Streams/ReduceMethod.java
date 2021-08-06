package Streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int result = list.stream().reduce(1, (a,b)->a*b);
        System.out.println(result);
    }
}
