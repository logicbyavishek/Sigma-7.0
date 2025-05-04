import java.util.*;

public class Java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range :");
        int n = sc.nextInt();
        int sum_even=0;
        int sum_odd=0;

        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum_even+=i; 
            }
            else{
                sum_odd+=i;
            }
        }
        System.out.println("Sum of even numbers is: "+sum_even);
        System.out.println("Sum of odd numbers is: "+sum_odd);
    }
    
}
