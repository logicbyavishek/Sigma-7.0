public class sample_swap {
    public static void main(String[] args) {
        int x =3 , y=4;
        System.out.println("Before swaping X: "+x+" , Y: "+y);
        // swap using xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swaping X: "+x+" , Y: "+y);

    }
}
