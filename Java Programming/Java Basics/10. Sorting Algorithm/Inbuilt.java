import java.util.*;
import java.util.Collections;
public class Inbuilt {
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        PrintArray(arr);
    }
    public static void PrintArray(Integer arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
