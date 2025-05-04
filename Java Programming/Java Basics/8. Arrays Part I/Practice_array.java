import java.util.*;

public class Practice_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks []= new int[50];
        // System.out.println(marks[49]);
        int numbers[]={90,88,98};
        // numbers[0]=100;
        // numbers[1]= numbers[0]+5;
        // numbers[2]= numbers[0]/0;

        // System.out.println(numbers[2]);

        // String fruits[]={"apple","mango","orange","banana"};

        char fruits[]=new char[5];

        // System.out.println(fruits[3]);

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();

        System.out.println("Physics :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("math :"+marks[2]);
        System.out.println("english :"+marks[3]);

        System.out.println("length of array"+marks.length);
    }
}
