import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        String filename = "person.dat";

        // Serialize object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Person person = new Person("John Doe", 30);
            out.writeObject(person);
            System.out.println("Object serialized.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person person = (Person) in.readObject();
            System.out.println("\nDeserialized Object:");
            person.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
