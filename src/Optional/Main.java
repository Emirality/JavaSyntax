package Optional;

// empty
// of
// isPresent
// get
// map
// orElse
// orElseGet
//


import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("hello");
        Optional<String> s1 = Optional.empty();
        if (s.isPresent()){
            System.out.println(s.get());
        }

        System.out.println(s1.isPresent());
        System.out.println(s1.orElse("empty"));
        System.out.println(s.orElse("empty"));
        // orElseGet required supplier
        System.out.println(s1.orElseGet(()->Integer.toString(new Human(2).getAge())));


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}


class Human{
    private int age;

    Human(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
