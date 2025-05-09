public class Bubble {
    public static void Bubble_alg(int arr[]){
        int n=arr.length;
        int swap = 0;
        for(int turn = 0 ; turn<n-1;turn++){
            for(int j =0 ; j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                if(swap == 0){
                    break;
                }
            }
        }
        System.out.println("Number of Swap :"+swap);
    }
    public static void PrintArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Bubble_alg(arr);
        PrintArr(arr);
    }
}
