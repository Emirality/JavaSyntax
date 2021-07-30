package FileS.File;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Objects;

//  /home/emiral/
public class Main {
    public static void main(String[] args) {
        Main.createFile("/home/emiral","log.txt");
        //Main.checkDirectory("/home/emiral");
        //Main.createDirectory("/home/emiral","UserProfile1");
        //Main.renameDirectory(new File("/home/emiral"),"Bit","Eth");
        Main.removeDirectory(new File("/home/emiral/Eth"));
    }

    // return smth?
    public static boolean createFile(String dir, String fileName){
        File file = new File(dir,fileName);
        boolean fileIsCreated = false;
        try {
            fileIsCreated = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileIsCreated;
    }

    public static void checkDirectory(String dir){
        File directory = new File(dir);
        if (directory.isDirectory()){
            for (File file : Objects.requireNonNull(directory.listFiles())){
                if (file.isDirectory()){
                    System.out.println(file.getName()+" is directory");
                }else {
                    System.out.println(file.getName()+" is file");
                }
            }
        }
    }

    public static void createDirectory(String path,String dirName){
        File file = new File(path+"/"+dirName);
        boolean isCreated = file.mkdir();
        if (isCreated){
            System.out.println("directory created");
        }else {
            System.out.println("smth goes wrong");
        }
    }

    public static void renameDirectory(File directory, String oldName, String newName){
        File dir = new File(directory+"/"+oldName);
        File newDir = new File(directory+"/"+newName);
        if (newDir.exists()){
            System.out.println("dir already exist");
        }else {
            dir.renameTo(newDir);
        }
    }

    //while dir is not empty,you can't delete him.
    public static void removeDirectory(File dir){
        dir.delete();
    }
}
