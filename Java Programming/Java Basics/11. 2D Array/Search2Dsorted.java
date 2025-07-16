public class Search2Dsorted{
    public static boolean search2Dsorted(int matrix[][],int target){
        int row =0 , col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if(matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }
    public static boolean Serachmethod2(int matrix[][], int target){
        int row = matrix.length-1, col =0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==target){
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if(target< matrix[row][col]){
                row--;
            } else{
                col++;
            }
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }
public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 33;
        search2Dsorted(matrix, target);

        Serachmethod2(matrix, 50);
    }
}