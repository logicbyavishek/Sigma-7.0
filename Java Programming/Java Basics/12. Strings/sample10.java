//Question 1: Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.*;

public class sample10 {
    public static void lowerCaseVowelCount(String str){
        String lv ="aeiou";
        int count =0;
        for(int i =0 ; i< str.length();i++){
            for(int j =0 ; j<lv.length();j++){
                if(str.charAt(i)==lv.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("lower case vowel occured "+count+" times");
    }
    public static void main(String[] args) {
        String str ="AEIOUaeiou";
        lowerCaseVowelCount(str);
    }
}
