package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //list
            // add
            // get(index)
            // indexOf(object)
            // remove(index)
            // set (index, object)
            // syblist(start, end)
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(2));
        humans.add(new Human(1));
        humans.add(new Human(0));
        humans.sort(Comparator.comparingInt(Human::getAge));
        for (Human h  : humans){
            System.out.print(h.getAge());
        }

        // Set
            //

        Set<Human> humanSet = new TreeSet<Human>(Comparator.comparingInt(Human::getAge));
        SortedSet<Human> sortedSet = new TreeSet<>(Comparator.comparingInt(Human::getAge));
    }
}

class Human{
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
