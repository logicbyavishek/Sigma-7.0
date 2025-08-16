public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // Create a pen Object 
        // p1.setcolor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.color = "Red"; // Change The color of pen
        // System.out.println(p1.color);
        // p1.tip=3;
        // System.out.println(p1.tip);

        // Bankaccount bank = new Bankaccount();
        // bank.username = "avishekd633";
        // bank.setpassword("abcdef234");
        // System.out.println(bank.username);
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(10);
        System.out.println(p1.gettip());
        
    }
}

// class Pen{
//     String color;
//     int tip;

//     void setcolor(String NewColor){
//         color = NewColor;
//     }
//     void setTip(int NewTip){
//         tip=NewTip;
//     }
// }

//Access Modifiers/Specifiers

// class Bankaccount{
//     public String username;
//     private String password;
//     public void setpassword(String pwd){
//         password=pwd;
//     }
// }

// Getters & Setters

class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String NewColor){
        this.color = NewColor ;
    }
    void settip(int tip){
        this.tip = tip;
    }
}