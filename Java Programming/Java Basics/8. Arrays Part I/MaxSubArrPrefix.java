public class MaxSubArrPrefix {
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};

        PrintSubarray(numbers);
    }

    public static void PrintSubarray(int numbers[]){
        
        int maxsum=Integer.MIN_VALUE;
        // define prefix
        int prefix[]=new int[numbers.length];

        // Calculate prefix sum 
        prefix[0]=numbers[0];
        for(int i =1;i<prefix.length;i++){

            prefix[i]=prefix[i-1]+numbers[i];

        }
        // Define start and end & Calculate Maxsum
        for(int i =0; i<numbers.length ; i++){
            int start = i;
            for(int j =i ; j<numbers.length ;j++){
                int end = j;

                int currsum= start==0?prefix[end]:prefix[end]-prefix[start-1];  // i need to dry run this for better understand

                    if(maxsum<currsum){
                        maxsum=currsum;
                    }   
                }
            
        }
        System.out.println("Maximum Subarray Sum is  :"+maxsum);
        
    }
}

