import java.util.*;

public class Java4 {

    public static void MultiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Multiplication table :");

        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " * " + i + " = " + n * i +"\t");
        }
    }
    public static void main(String[] args) {
        MultiplicationTable();
    }
}
//