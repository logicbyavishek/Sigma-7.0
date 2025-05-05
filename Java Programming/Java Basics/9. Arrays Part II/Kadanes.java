public class Kadanes {
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes_algo(numbers);
    }

    public static void kadanes_algo(int numbers[]){
        int maxsum = Integer.MIN_VALUE; // Maximum Sum
        int currsum = 0; //Current Sum

        for(int i=0; i<numbers.length;i++){
            currsum=currsum+numbers[i]; //currsum+=numbers[i];
            // Rule of the Kadane's Algorithm not consider cuurent sum -ve (negative)
            if(currsum<0){
                currsum=0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("The maximum sum is :"+maxsum);
    }
}
