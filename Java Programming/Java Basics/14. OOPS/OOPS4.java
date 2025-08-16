// INHERITENCE---> iii) Hierarchial Inheritance 

public class OOPS4 {
    public static void main(String[] args) {
        Mamal dog = new Mamal();
        Fish tuna = new Fish();
        Bird eagal = new Bird();

        dog.walk();
        tuna.Swim();
        eagal.fly();
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
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void Swim(){
        System.out.println("Swims in water ");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly in sky");
    }
}
