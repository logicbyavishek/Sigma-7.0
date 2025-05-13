public class Insertion {
    public static void InsertionSort(int numbers[]){
        for(int i = 1 ; i<numbers.length;i++){
            int curr = numbers[i];
            int prev = i-1;
            while (prev>=0 && numbers[prev]>curr) {
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1]=curr;
        }
    }

    public static void PrintArray(int numbers[]){
        System.out.print("[");
        for(int i =0 ; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int numbers[]={0,5,4,1,3,2};
        System.out.print("Actual Array : ");
        PrintArray(numbers);
        System.out.println();
        InsertionSort(numbers);
        System.out.print("Array after Insertion sort :");
        PrintArray(numbers);
    }
}
