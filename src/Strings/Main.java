package Strings;

public class Main {
    public static void main(String[] args) {
        String a1 = "hello";
        String a2 = "hello";
        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);
        String a3 = new String("hello");
        String a4 = new String("hello");
        System.out.println(a3.equals(a4));
        System.out.println(a3==a4);



        // boolean startWith(string) endWith(string)
        // compareTo
        // indexOf lastIndexOf
        // subString
        // concat
        // replace
        // trim
        // toLowerCase toUpperCase
        // join(separator, string1, string2 ...)
        // split


        StringBuffer sb = new StringBuffer();
        sb.append("Vlad programmer");
        sb.insert(4, " best");
        System.out.println(sb);
        sb.delete(4,9);
        System.out.println(sb);

        // reverse
        //delete( start index, end index)
        // deleteCharAt(index)
        // replace(start index, end index, Sting)
        // subString
        // use StringBuilder instead of StringBuffer for more better performance


    }
}
