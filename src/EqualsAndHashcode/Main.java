package EqualsAndHashcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(1,"Vlad","Burak");
        Human h3 = new Human(1,"Vlad","Burak");

        System.out.println(h1.equals(h3));
        System.out.println(h1.hashCode());
        System.out.println(h3.hashCode());

    }
}


class Human{
    int id;
    String name;
    String surName;

    public Human(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && Objects.equals(name, human.name) && Objects.equals(surName, human.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName);
    }
}


class superHuman extends Human{
    public superHuman(int id, String name, String surName) {
        super(id, name, surName);
    }
}
