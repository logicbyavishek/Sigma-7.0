// INHERITENCE--->

public class OOPS2 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}
