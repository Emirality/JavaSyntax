package Practice;

import java.util.List;

//Given a non-empty string and an int n, return a new string where the char at index n has been removed.
// The value of n will be a valid index of a char in the original string
// (i.e. n will be in the range 0..str.length()-1 inclusive).
public class MissingChar {
    public static void main(String[] args) {
        System.out.println( missChar("Programmer",0));
        String s = "hello";
        String s1 = "";

        System.out.println(s1+s.charAt(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0));
        String s3 = "The quick brown fox jumps over the lazy dog";
        String[] arr = s3.split(" ");
        System.out.println(arr.length);
    }



    public static String missChar(String s, int n){
        String front = s.substring(0,n);
        String back = s.substring(n+1);
        return front+back;
    }


}
