public class largestNumber {
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        
        int largest=LarNum(numbers);

        System.out.println("The largest number in given array is "+largest);
    }

    public static int LarNum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
}
