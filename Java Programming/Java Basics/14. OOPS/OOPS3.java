// INHERITENCE---> ii) Multi Level

public class OOPS3 {
    public static void main(String[] args) {
        Dogs Bholu = new Dogs();
        Bholu.eats();
        Bholu.legs=4;
        Bholu.bark();
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

class Mamal extends Animal{
    int legs;
}

class Dogs extends Mamal{
    void bark(){
        System.out.println(" BHou BHou ");
    }
}

