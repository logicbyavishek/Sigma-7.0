import java.util.*;

public class sample_EvenOdd {
    public static void checkEvenOdd(int n){
        int Bitmask = 1;
        if((n&1)==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Even or odd through Bitmask: ");
        int num = sc.nextInt();
        checkEvenOdd(num);
    }
}
