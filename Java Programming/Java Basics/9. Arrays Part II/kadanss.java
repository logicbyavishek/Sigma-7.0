public class kadanss {

    
        public static void main(String[] args) {
            int numbers[] = {-1,-2,-3,-4,-6,-7,-5,-8,-9,-10,-55,50};
            kadanes_algo(numbers);
        }
    
        public static void kadanes_algo(int numbers[]) {
            int maxsum = numbers[0]; // Initialize to first element
            int currsum = numbers[0]; // Also initialize to first element
    
            for (int i = 1; i < numbers.length; i++) {
                currsum = Math.max(numbers[i], currsum + numbers[i]);
                maxsum = Math.max(maxsum, currsum);
            }
    
            System.out.println("The maximum sum is: " + maxsum);
        }
    
    
    



}
