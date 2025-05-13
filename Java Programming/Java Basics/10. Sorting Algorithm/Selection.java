public class Selection {
    public static void SelectionSort(int numbers[]){
        for(int i =0 ; i <numbers.length;i++){
            int Minpos = i ;
            for(int j =i+1;j<numbers.length;j++){
                if(numbers[Minpos]>numbers[j]){
                    Minpos=j;
                }
            }
            int temp =  numbers[Minpos];
            numbers[Minpos]=numbers[i];
            numbers[i]=temp;
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
        int numbers[]={5,4,1,3,2};
        System.out.print("Actual Array : ");
        PrintArray(numbers);
        System.out.println();
        SelectionSort(numbers);
        System.out.print("Array after selection sort :");
        PrintArray(numbers);
    }
}
