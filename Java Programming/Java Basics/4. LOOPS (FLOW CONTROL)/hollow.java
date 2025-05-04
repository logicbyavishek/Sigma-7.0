import java.util.*;

public class hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ;i<=n;i++){
            if (i==1||i==n){
                System.out.println("*   *   *   *   *");
            }
            else{
                System.out.println("*               *");
            }
        }
    }
}
