
class Animal {
    String species;
    String animalName;

    Animal(String species, String animalName) {
        this.species = species;
        this.animalName = animalName;
    }

    void eat() {
        System.out.println(animalName + " (" + species + ") is eating.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String species, String animalName, String breed) {
        super(species, animalName);
        this.breed = breed;
    }

    void bark() {
        System.out.println(animalName + " (" + breed + ") is barking.");
    }
}

class Cat extends Animal {
    String furColor;

    Cat(String species, String animalName, String furColor) {
        super(species, animalName);
        this.furColor = furColor;
    }

    void meow() {
        System.out.println(animalName + " (" + furColor + " fur) is meowing.");
    }
}

public class hierani {
    public static void main(String[] args) {
        Dog dog = new Dog("Canine", "Rex", "German Shepherd");
        dog.eat();
        dog.bark();

        System.out.println();

        Cat cat = new Cat("Feline", "Mittens", "Gray");
        cat.eat();
        cat.meow();
    }
}
