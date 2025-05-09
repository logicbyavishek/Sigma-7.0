public class Bubble {
    public static void Bubble_alg(int arr[]){
        int n=arr.length;
        int swap = 0;
        for(int turn = 0 ; turn<n-1;turn++){ // outer loop runs n times
            for(int j =0 ; j<n-1-turn;j++){ // Inner loop runs n-1 time
                if(arr[j]>arr[j+1]){ // comparison 
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                if(swap == 0){ // for Best Case when array is sorted tim complexity O(n). Best code optimization .
                    break;
                }
            }
        }
        System.out.println("Number of Swap :"+swap);
    }
    public static void PrintArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){ // print array to check it,s sorted or not ?
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Bubble_alg(arr); // call bubble sort algo .
        PrintArr(arr); // call array print function .
    }
}
