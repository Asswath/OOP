abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cow extends Animal {
    Cow(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Moo!");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cow = new Cow("Daisy");

        dog.makeSound();
        cow.makeSound();
    }
}
