import java.util.*;

public class Patter1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of line of Half Pyramid :");
        int n = sc.nextInt();

        System.out.println();

        for(int i =1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
