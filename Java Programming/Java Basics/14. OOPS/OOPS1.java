// --- COPY CONSTRUCTOR ---
public class OOPS1 {
    public static void main(String[] args) {
        Avishek s1 = new Avishek();
        s1.name="Avishek";
        s1.rollno=36;
        s1.password = "abced";

        s1.marks[0]=90;
        s1.marks[1]=100;
        s1.marks[2]=80;


        Avishek s2 = new Avishek(s1);
        s2.password = "xyz";
        s1.marks[2]=100;

        for(int i = 0 ; i<3 ;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Avishek{
    String name;
    int rollno;
    String password;
    int marks[];

    //shallow copy constructor -->
    // Avishek(Avishek s1){
    //     marks = new int[3];
    //     this.name=s1.name;
    //     this.rollno=s1.rollno;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor -->
    Avishek(Avishek s1){
        marks = new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        for(int i = 0 ; i<3 ;i++){
            this.marks[i]=s1.marks[i];
        }

    }
    Avishek(){
        marks = new int[3];
        System.out.println("Constructor is called......");
    }
}
