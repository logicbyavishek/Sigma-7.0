public class Sample3 {
    public static boolean isPalindrome(String str){
        int n=str.length();
        for(int i =0 ; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="noon";
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome(str));
    }
}
