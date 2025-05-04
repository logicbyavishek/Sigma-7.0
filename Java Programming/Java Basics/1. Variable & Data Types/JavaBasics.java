/*Question1:
Inaprogram,input3numbers:A,B and C.You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
*/

import java.util.*;
public class JavaBasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average = (a + b + c) / 3;
        System.out.println("Average of three numbers is: " + average);

    }
}