import java.util.*;

public class Base2d_Array {

    public static boolean SerachElement(int matrix[][],int key){
        int n = matrix.length , m = matrix[0].length;
        
        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell :"+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix [] [] = new int [3][3];
        // n = row and m = column 
        int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        // input 2D Array 

        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // for 2D ARRAY PRINT 

        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        SerachElement(matrix, 5);
    }
    
}
