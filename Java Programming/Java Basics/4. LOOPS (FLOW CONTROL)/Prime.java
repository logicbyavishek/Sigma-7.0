import java.util.*;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean is_Prime =true;
        if (n==1){
            System.out.println("You enterd number is 1. then it's 1 is neither Prime nor Composite number . It is a special case");
        }
        else{
            if(n==2){
                System.out.println("Prime");
            }
            else{
                for (int i = 2; i<=Math.sqrt(n);i++){
                    if (n%i==0){
                        is_Prime=false;
                        break;
                    }
                }
                if (is_Prime==true){
                    System.out.println("Prime");
                }else{
                    System.out.println("Not a Prime");
                }
            }
        }
    }
}