public class RecursionBasics {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n +" ");
    }

    public static void fact(int n , int mul){
        // int mul = 1;
        if(n==1){
            mul = mul*n;
            System.out.println(mul);
            return;
        }
        mul = mul * n;
        fact(n-1,mul);
    }

    public static int facto(int n){
        if(n==0){
            return 1;
        }
        int fnm1= facto(n-1);
        int fn = n * facto(n-1);
        return fn ;
    }

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int fnm1= Sum(n-1);
        int fn = n + Sum(n-1);  
        return fn ;
    }

    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        // fact(n , 1);
        // System.out.println(facto(n));
        System.out.println(Sum(n));
    }
}
