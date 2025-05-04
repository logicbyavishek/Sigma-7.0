public class Subarray {
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};

        PrintSubarray(numbers);
    }

    public static void PrintSubarray(int numbers[]){
        
        int maxsum=Integer.MIN_VALUE;
        for(int i =0; i<numbers.length ; i++){
            int start = i;

            for(int j =i ; j<numbers.length ;j++){
                int end = j;

                // int currsum=0;
                for(int k = start ; k <= end ; k++){
                    System.out.print(numbers[k]+" ");

                    // currsum+=numbers[k];
                    // if(maxsum<currsum){
                        // maxsum=currsum;
                    // }
                    
                }

                // System.out.print("Current sum :-"+currsum);
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Maximum Subarray Sum is  :"+maxsum);
        System.out.println();
    }
}
