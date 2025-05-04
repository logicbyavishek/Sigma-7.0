import java.util.*;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you check the factorial ");
        int n = sc.nextInt();
        int fact = 1;

        if(n<0){
            System.out.println("Factorial is not defined for negative numbers");
        }
        else{
            if(n==0){
                System.out.println("Factorial of 0 is 1");
            }
            else{
                for(int i=1;i<=n;i++){
                    fact = fact*i;
                }
                System.out.println("Factorial of the given number: "+ n+"!" +" is "+ fact );
            }
        }
    }
    
}
