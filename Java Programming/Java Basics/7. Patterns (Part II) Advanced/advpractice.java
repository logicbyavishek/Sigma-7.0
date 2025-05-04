public class advpractice {
    public static void main(String[] args) {
        // hlwrect(4,5);

        invpattern(4);

    }

    public static void hlwrect(int row , int col){
        for(int i=1; i<=row;i++){
            for(int j =1; j<=col ; j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invpattern(int n){
        // row->
        for(int i = 1; i<=n ; i++){
            // space -->
            for(int j = 1 ; j<= n-i ; j++){
                System.out.print(" ");
            }
            // star -->
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
