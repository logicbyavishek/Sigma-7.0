public class anagrams {
    public static boolean checkAnagrams(String str,String str1){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str ="care";
        String str1 = "race";
        System.out.println("both string are anagrams ? :"+checkAnagrams(str, str1));
    }
}
