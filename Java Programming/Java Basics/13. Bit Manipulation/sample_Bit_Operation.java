import java.util.*;

public class sample_Bit_Operation {
    
    // Sample code to get the ith bit of a number
    public static int getIthbit(int n , int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    // sample code block of Set ith bit 
    public static int setIthBit(int n , int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    // sample code block of Clear ith bit 
    public static int ClearithBit(int n , int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    // Update ith bit 
    public static int UpdateIthBit(int n , int i,int newBit){
        n = ClearithBit(n, i); // for this we clear n first
        
        int bitmask = (newBit<<i);
        
        return  n | bitmask;
    }

    // UPdate nth bit east approach ---
    public static int UpdateIthBIt2(int n , int i , int newBit){
        if(newBit == 0 ){
            return ClearithBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        // int n =5 ;
        // int i =2;
        // System.out.println("The " + i + "th bit of " + n + " is: " + getIthbit(n, i));
        // Example: For n=5 (binary 101), the 2nd bit is 1 (counting from 0).
        // int n =10;
        // int i =1;

        // System.out.println("The set " + i + "th bit of " + n + " is: " + setIthBit(n, i)); n =10 , i = 2 output = 14
        
        // System.out.println("The set " + i + "th bit of " + n + " is: " + ClearithBit(n, i)); // n = 10 , i =2 , output = 8
        
        int n = 10;
        int i = 2;
        int newBit = 1;
        
        // System.out.println( UpdateIthBit(n, i, newBit)); // n = 10 , i = 2, newBit = 1 ;
        System.out.println(UpdateIthBIt2(n, i, newBit));

    }
}
