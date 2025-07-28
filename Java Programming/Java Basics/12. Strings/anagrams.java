import java.util.*;

public class anagrams {
    public static boolean checkAnagrams(String str,String str1){
        if(str.length()!=str1.length()){
            return false;
        }else{
            // make all string into lower case if we dont use case sensitive
            String Lostr,Lostr1;
            Lostr = str.toLowerCase();
            Lostr1 = str1.toLowerCase();
            
            // Lostr=str;Lostr1=str1; if we use case sensitive then use it

            // create char arry
            char [] arr1 = Lostr.toCharArray();
            char [] arr2 = Lostr1.toCharArray();

            // sort this arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // check both are equal or not ?

            return Arrays.equals(arr1,arr2);
        }
    }
    public static void main(String[] args) {
        String str ="care";
        String str1 = "RACE";
        System.out.println("both string are anagrams ? :"+checkAnagrams(str, str1));
    }
}
