package FileS.File;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

//sublist
//removeIf
//set

public class WorkWithFilesAndPathes {
    public static void main(String[] args) {
        File file = new File("/home/emiral/IdeaProjects/JavaSyntax/log.txt");
        Path path = Paths.get("/home/emiral/IdeaProjects/JavaSyntax/log.txt");

        System.out.println(path);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.removeIf(s-> s==3);
        System.out.println(list);
        list.set(1,3);
        System.out.println(list);
        list.add(1,1);
        System.out.println(list);

        Set<Integer> set=new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(0);
        System.out.println(set);
    }
}
