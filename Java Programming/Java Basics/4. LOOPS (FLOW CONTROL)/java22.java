import java.util.*;

public class java22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int even_sum = 0;
        int odd_sum = 0;

        do {
            System.out.println("Enter a number");
            number = sc.nextInt();

            if(number%2==0){
                even_sum += number;
            }
            else{
                odd_sum += number;
            }
            System.out.println("Do you want to continue? 1 for yes, 0 for no");
            choice = sc.nextInt();
        } while (choice==1);
        System.out.println("Even sum: " + even_sum);
        System.out.println("Odd sum: " + odd_sum);
    }
    
}
