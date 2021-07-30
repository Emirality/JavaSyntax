package FileS.FileWriterReader;

import java.io.*;

public class Main {
    public static void main(String[] args) {
            Main.writeFile("zdarova");
            Main.readFile();

    }

    public static void writeFile(String message){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/home/emiral/IdeaProjects/JavaSyntax/src/FileS/text",true))) {
            bw.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("/home/emiral/IdeaProjects/JavaSyntax/src/FileS/text"))) {
            int c;
            while ((c= br.read())!=-1){
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
