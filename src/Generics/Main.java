package Generics;

public class Main <T> implements Calc<T>{
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        System.out.println(isIn(2,nums));

        Gen<Integer> gen = new Gen2<>();
        String[] s = {"hello","world"};
        print(s);
        Integer[] i = {1,2,3,4,5};
        print(i);
    }
    public static <T extends Comparable<T>, V extends T> boolean isIn(T num, V[] arr){
        for (V v : arr) {
            if (num == v) {
                return true;
            }
        }
        return false;
    }

    public static <T> void print(T[] arr){
        for (T a: arr) {
            System.out.println(a);
        }
    }

    @Override
    public T add() {
        return null;
    }

    @Override
    public T sub() {
        return null;
    }
}

interface Calc<T>{
    T add();
    T sub();
}

class Gen<T>{}
class Gen2<T> extends  Gen<T>{}
