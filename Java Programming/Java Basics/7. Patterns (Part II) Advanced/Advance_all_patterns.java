public class Advance_all_patterns {
    public static void main(String[] args) {
        //All advance patterns fuction call here :--->>

        hlwRect(4,5);
        
        Inverted_half_pyramid(4);
        
        Inverted_half_pyramid_withNumber(5);
        
        FloydTriangle(5);
        
        ZeroOneTriangle(5);
        
        ButterflyPattern(4);
        
        solidRhombus(5);
        
        hollowRhombus(5);

        diamond(4);

    }
    public static void Inverted_half_pyramid(int n){
        /*
        The out put like -->
           *
          **
         ***
        ****
         */
        for(int i =1; i<=n;i++){
            for(int j=1 ; j<=(n-i) ;j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void Inverted_half_pyramid_withNumber(int n){
        /*
        The out put like -->
        12345
        1234
        123
        12
        1
         */

        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // FLOYD'S TRIANGLE 
    public static void FloydTriangle(int n) {
        /*
        The output like -->
        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
         */

        int counter =1 ;

        for(int i =1 ; i<= n ; i++){
            
            for(int j =1 ; j<=i ; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 TRIANGLE 
    public static void ZeroOneTriangle(int n) {
        /*
        The output like -->
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */
        for(int i =1; i<= n ; i++){
            for(int j =1; j<=i ;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // BUTTERFLY PATTERN :-
    public static void ButterflyPattern(int n) {
        /*
        The output like -->
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

         */

        // 1st Half
        for(int i =1 ; i<=n;i++){
            // Stars-->
            for(int j =1 ; j<=i ; j++){
                System.out.print("*");
            }

            // spaces-->

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // Stars-->
            for(int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half

        for(int i=n; i>=1 ; i--){
            // Stars-->

            for(int j =1 ; j<=i ; j++){
                System.out.print("*");
            }   
            // spaces-->

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }   
            // Stars-->
            
            for(int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // SOLID RHOMBUS :~
    public static void solidRhombus(int n) {
        /*
        The output like -->
            ****
           ****
          ****
         ****
        ****

         */

        for(int i=1;i<=n;i++){
            // spaces-->
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars-->
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // HOLLOW RHOMBUS PATTERN :-
    public static void hollowRhombus(int n) {
        /*
        The output like -->
            *****
           *   *
          *   *
         *   *
        *****

         */

        for(int i =1;i<=n;i++){
            // spaces-->
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //   HOLLOW RECTANGLE --- stars-->
            for(int j =1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // HOLLOW RECTANGLE :--
    public static void hlwRect(int totRow,int totCol){
        /*
        The output like -->
        *****
        *   *
        *   *
        *****
         */
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

    //  DIAMOND PATTERN :~
    public static void diamond(int n){
        /*
        The output like -->>
           *
          ***
         *****
        *******
        *******
         *****
          ***
           *
        
         */

        for(int i=1;i<=n;i++){
            // spaces-->
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars-->
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // print the lower half of the diamond pattern
        for(int i=n;i>=1;i--){
            // spaces-->
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars-->
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


