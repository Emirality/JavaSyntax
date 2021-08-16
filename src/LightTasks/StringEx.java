package LightTasks;

public class StringEx {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "vlad";
        arr[2] = "champion";
        arr[3] = "amazing";
        arr[4] = "distinguish";

        System.out.println(findMinStringInArray(arr));
        System.out.println( isPalindrome("madam1"));

    }
    public static String findMinStringInArray(String[] arr){
        String min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min.length() > arr[i].length()){
                min = arr[i];
            }
        }
        return min;
    }

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
