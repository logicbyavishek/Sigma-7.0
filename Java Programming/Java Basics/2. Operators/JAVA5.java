public class JAVA5 {
    public static void main(String[] args) {
        int x = 10 , y = 5;

        int exp1 = (y*(x/y+x/y));
        int exp2 = (y*x/y+y*x/y);
        System.out.println("Expression 1: " + exp1);
        System.out.println("Expression 2: " + exp2);
    }
}