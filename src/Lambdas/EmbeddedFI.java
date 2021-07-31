package Lambdas;

import java.util.Locale;
import java.util.function.*;

public class EmbeddedFI {
    public static void main(String[] args) {
        //u can use and or for more than 1 condition;
        //predicate check some condition
        Predicate<String> predicate = x -> x.length() > 5;
        predicate.test("hello");
        predicate.test("hello123");

        // BinaryOperator take 2 parameters type T both and return result same type T.
        BinaryOperator<Integer> multiply = (x,y) -> x*y;
        System.out.println(multiply.apply(3,4));

        //UnaryOperator like BinaryOperator but take 1 parameter
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase(Locale.ROOT);
        System.out.println(unaryOperator.apply("legend"));

        // Function take type T and return type R
        // BiFunction take 2 val  T, U return R
        Function<Integer, Double> function = Integer::doubleValue;
        System.out.println(function.apply(5));

        //Consumer modify, but don't return
        Human myHuman = new Human(5);
        Consumer<Human> consumer = human -> human.setAge(2);
        consumer.accept(myHuman);
        System.out.println(myHuman.getAge());

        // Supplier don't take, but return
        Supplier<Human> supplier = ()-> new Human(10);
        System.out.println(supplier.get().getAge());
    }
}

class Human{
    private int age;
    Human(int age){this.age = age;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
