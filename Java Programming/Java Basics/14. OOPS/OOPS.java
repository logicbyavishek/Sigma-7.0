public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Create a pen Object 
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Red"; // Change The color of pen
        System.out.println(p1.color);
        p1.tip=3;
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setcolor(String NewColor){
        color = NewColor;
    }
    void setTip(int NewTip){
        tip=NewTip;
    }
}
