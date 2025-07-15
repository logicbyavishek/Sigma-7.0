public class DiagonalSum {
    public static int CalculateDiagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length; // Assuming a square matrix

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j){ // Primary diagonal
        //             sum += matrix[i][j];
        //         }
        //         else if(i + j == n - 1){ // Secondary diagonal
        //             sum += matrix[i][j];
        //         }
        //     }
        // } ## This is an alternative approach to calculate diagonal sum bease it checks each element individually.
        // The above approach is less efficient than the one below, as it checks every element in the matrix. above appoach is O(n^2) time complexity.

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary diagonal
            if (i != n - 1 - i) { // Avoid double counting the middle element in odd-sized matrices
                sum += matrix[i][n - 1 - i]; // Secondary diagonal
            }
        }
        return sum;
    }
        public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int diagonalSum = CalculateDiagonalSum(matrix);
        System.out.println("Diagonal Sum: " + diagonalSum);
    }
}
