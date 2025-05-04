import java.util.*;

public class Bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the item ammount :");

        System.out.print("Penccil ammount : ");
        float pencil = sc.nextFloat();

        System.out.print("Pen ammount : ");
        float pen = sc.nextFloat();

        System.out.print("Eraser ammount : ");
        float eraser = sc.nextFloat();

        System.out.println("-------------------------");

        System.out.print("Total Bill : ");
        float total_bill = pencil+pen+eraser;
        System.out.println(total_bill);

        System.out.print("Total Bill with GST :");
        float gst_bill = total_bill+(total_bill*0.18f);
        System.out.println(gst_bill);
        

    }
}