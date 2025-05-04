import java.util.*;

public class HolloRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t--HOLLOW RECTANGLE PATTTERN--\t");

        System.out.print("Enter number of Rows :");
        int a = sc.nextInt();
        System.out.print("Enter number of Columns :");
        int b = sc.nextInt();

        hlwRect(a, b);
    }

    public static void hlwRect(int totRow,int totCol){
        //outer loop --> Rows
        for(int i =1 ; i<=totRow ; i++){
            // inner loop --> Columns
            for(int j =1 ; j<=totCol ; j++){
                // for cell of matrix (i,j) or (Rows, Columns)
                /* 
                 * if cell is at the first row or last row then print *
                 * it is check our boundary condition
                 * (row=1||column=1||row=TotalRow||column=TotalColumn)
                 */
                if(i==1 || i==totRow || j==1 || j==totCol){
                    // boundary conditions satisfy then print * 
                    // other wise print blank space in else condition
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            /* This is end of the inner loop. 
             * when inner loops are end then print a new line 
             */
            System.out.println();
        }
    }
}
