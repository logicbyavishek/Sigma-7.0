public class BinarySearch {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 10 ;

        int index = BinSer(numbers,key);

        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("index found at index : "+index);
        }

    }

    public static int BinSer(int numbers[] , int key){
        int start = 0;
        int n = numbers.length;
        int end = n-1; //int end = numbers.length-1; if we write this then no need to initialize n .

        while (start<= end) {
            int mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] > key){
                end = mid -1 ;
            }
            else if (numbers[mid] < key){
                start=mid+1;
            }
            
        }
        return -1;
    }
}
