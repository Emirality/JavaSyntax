package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestClass {

    public static void main(String []args) {

    }

    public static  void print(List<? extends Human> list) {
        for(Human human : list){
            human.takeInfo();
        }
    }
    void foo(List<?> list){
        fooHelp(list);
    }
    <T> void fooHelp(List<T> list){
        list.set(0,list.get(0));
    }
}

interface Human{
    int takeInfo();
}

class superHuman implements Human{
    private int age;

    superHuman(int age){
        this.age = age;
    }

    @Override
    public int takeInfo() {
        return this.age;
    }
}