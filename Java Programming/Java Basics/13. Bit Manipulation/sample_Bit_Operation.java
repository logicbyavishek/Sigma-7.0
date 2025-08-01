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

    // Clear Last **i th BITS** -->
    public static int clearLastIthBits(int n , int i){
        int bitmask = ~(0)<<i;
        return n & bitmask;
    }

    // Clear Range of Bits ===>>
    public static int clearRangeOf_ithBits(int n , int i , int j){
        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    // #Question 3 : Count Set Bits in a Number 
    public static int CountSetBit(int n){
        int count = 0 ;
        while(n>0){
            if((n&1)!=0){
                count ++;
            }
            n=n>>1;
        }
        return count;
    }

    // FAST EXPONENTIATION : normal exponentiation time complexity O(n) convert it by using bit manipulation O(log n)
    public static int FastExpo(int a , int n){ // a^n , a=actual number , n = power
        int ans = 1;
        while(n>0){
            if((n&1)!=0){ // check LSB least Significant Bit
                ans = ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
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
        
        // int n = 10;
        // int i = 2;
        // int newBit = 1;
        
        // System.out.println( UpdateIthBit(n, i, newBit)); // n = 10 , i = 2, newBit = 1 ; output = 14
        // System.out.println(UpdateIthBIt2(n, i, newBit));
        // System.out.println(clearLastIthBits(15, 2)); // n = 15 , i =2 , output = 12
        // System.out.println(clearRangeOf_ithBits(10, 2, 4)); // n = 10 , i = 2 , j =4 , output= 2 

        // Question 3
        // System.out.println(CountSetBit(10)); // n=10 (1010)---> 1 count is 2 , output = 2
        System.out.println(FastExpo(3, 5)); // a = 3 , n = 5 [a^n = 3^5] , output = 243

    }
}
