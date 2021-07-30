package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//allmatch
//anymatch
//nonematch
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(0);
        list.add(0);

        System.out.println(list.stream().distinct().count());

        Stream<Integer> myStream = list.stream();
        Optional<Integer> min = myStream.min(Integer::compare);
        System.out.println(min.isPresent() ? min.get() : "null");
        Optional<Integer> red = list.stream().reduce( Integer::sum);
        System.out.println(red.isPresent() ? red.get() : "null");

        Stream<Double> streamDoubles = list.stream().map(a->Math.pow(a,2));
        streamDoubles.forEach(System.out::println);

        List<Integer> newList = list.stream().filter(a -> a >= 0).collect(Collectors.toList());
        System.out.println(newList);


        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000),
                new Phone("Nokia 9", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("LG G6", 32000));

        Map<String, Integer> phones = phoneStream.collect(Collectors.toMap(Phone::getName, Phone::getPrice));

    }
}


class Phone{

    private String name;
    private int price;

    public Phone(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
