// Sample code to get the ith bit of a number

public class sample_getithBit {
    public static int getIthbit(int n , int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n =5 ;
        int i =2;
        System.out.println("The " + i + "th bit of " + n + " is: " + getIthbit(n, i));
        // Example: For n=5 (binary 101), the 2nd bit is 1 (counting from 0).
    }
}
