public class Kadanes_update {
    // In this updated cod we also find the maxsub array and print it 
        public static void main(String[] args) {
            int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
            kadanes_algo(numbers);
        }
    
        public static void kadanes_algo(int numbers[]) {
            int maxsum = numbers[0];
            int currsum = numbers[0];
            int start = 0, end = 0, tempStart = 0;
    
            for (int i = 1; i < numbers.length; i++) {
                if (currsum + numbers[i] < numbers[i]) {
                    currsum = numbers[i];
                    tempStart = i; // start a new subarray
                } else {
                    currsum += numbers[i];
                }
    
                if (currsum > maxsum) {
                    maxsum = currsum;
                    start = tempStart;
                    end = i;
                }
            }
    
            System.out.println("Maximum sum is: " + maxsum);
            System.out.print("Subarray is: ");
            for (int i = start; i <= end; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    
    
    
}
